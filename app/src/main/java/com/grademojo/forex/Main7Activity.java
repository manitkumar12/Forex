package com.grademojo.forex;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.DeviceLoginButton;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.facebook.share.widget.ShareDialog;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main7Activity extends AppCompatActivity implements  GoogleApiClient.OnConnectionFailedListener {


    private static final int RC_SIGN_IN = 007;

    private CardView card_View_Sign_in ,card_view_login, card_view_google_login;

    private TextView sign_Text_view ,login_text_view; 
            
 //private LoginButton google_text_view_login;

    Intent i;

    ImageView image_fb;

    private ImageView face_image;
    private ImageView google_image;
    private CardView card_view_facebook;

    private CallbackManager callbackManager;
    private ShareDialog shareDialog;
    LoginButton login;
    SignInButton google_text_view_login;
    private ProfilePictureView profile;
    private Dialog details_dialog;
    private TextView details_txt;
    private String facebook_id,f_name, m_name, l_name, gender, profile_image, full_name, email_id;


    private GoogleApiClient mGoogleApiClient;
    private ProgressDialog mProgressDialog;

    private SignInButton btnSignIn;
    private Button btnSignOut, btnRevokeAccess;
    private LinearLayout llProfileLayout;
    private ImageView imgProfilePic;
    private TextView txtName, txtEmail;

    private static final String TAG = Main7Activity.class.getSimpleName();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        FacebookSdk.sdkInitialize(getApplicationContext());


        card_View_Sign_in = (CardView) findViewById(R.id.card_view_sign_in);
        sign_Text_view = (TextView) findViewById(R.id.text_view_sign_in);
        card_view_login = (CardView) findViewById(R.id.login_card_view);
        login_text_view = (TextView) findViewById(R.id.login_text_view);
        card_view_google_login = (CardView) findViewById(R.id.card_face_google);
        google_text_view_login = (SignInButton) findViewById(R.id.login_button_google);
        google_image = (ImageView) findViewById(R.id.gb);


        btnSignOut = (Button) findViewById(R.id.btn_sign_out);
        btnRevokeAccess = (Button) findViewById(R.id.btn_revoke_access);
        llProfileLayout = (LinearLayout) findViewById(R.id.llProfile);
        imgProfilePic = (ImageView) findViewById(R.id.imgProfilePic);
        txtName = (TextView) findViewById(R.id.txtName);
        txtEmail = (TextView) findViewById(R.id.txtEmail);



        callbackManager = CallbackManager.Factory.create();
        login = (LoginButton) findViewById(R.id.login_button);
        face_image = (ImageView) findViewById(R.id.fb);
        card_view_facebook = (CardView) findViewById(R.id.card_face);


        shareDialog = new ShareDialog(this);
        login.setReadPermissions("public_profile email");

        details_dialog = new Dialog(this);
        details_dialog.setContentView(R.layout.dialog_details);
        details_dialog.setTitle("Details");

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

        google_text_view_login.setSize(SignInButton.SIZE_STANDARD);
        google_text_view_login.setScopes(gso.getScopeArray());





     



        getKeyHash();


        card_View_Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Main2Activity.class);
                startActivity(i);

            }
        });

        sign_Text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Main2Activity.class);
                startActivity(i);

            }
        });


        card_view_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Sign_up.class);
                startActivity(i);

            }
        });

        login_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Sign_up.class);
                startActivity(i);

            }
        });




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(AccessToken.getCurrentAccessToken() != null) {

                    //profile.setProfileId(null);
                }
            }
        });


        login.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {


            @Override
            public void onSuccess(LoginResult loginResult) {

                facebook_id=f_name= m_name= l_name= gender= profile_image= full_name= email_id="";

                if(AccessToken.getCurrentAccessToken() != null){
                    RequestData();
                    Profile profile = Profile.getCurrentProfile();
                    if (profile != null) {
                        facebook_id=profile.getId();
                        Log.e("facebook_id", facebook_id);
                        f_name=profile.getFirstName();
                        Log.e("f_name", f_name);
                        m_name=profile.getMiddleName();
                        Log.e("m_name", m_name);
                        l_name=profile.getLastName();
                        Log.e("l_name", l_name);
                        full_name=profile.getName();
                        Log.e("full_name", full_name);
//                        profile_image=profile.getProfilePictureUri(400, 400).toString();
//                        Log.e("profile_image", profile_image);
                    }

                }
            }

            @Override
            public void onCancel() {

            }
            private void signIn() {
                Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                startActivityForResult(signInIntent, RC_SIGN_IN);
            }

            private void revokeAccess() {
                Auth.GoogleSignInApi.revokeAccess(mGoogleApiClient).setResultCallback(
                        new ResultCallback<Status>() {
                            @Override
                            public void onResult(Status status) {
                                updateUI(false);
                            }
                        });
            }

            public void onActivityResult(int requestCode, int resultCode, Intent data) {
                callbackManager.onActivityResult(requestCode,resultCode,data);

                // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
                if (requestCode == RC_SIGN_IN) {
                    GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
                    handleSignInResult(result);
                }
            }


            public void onStart() {
                mProgressDialog.onStart();

                OptionalPendingResult<GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
                if (opr.isDone()) {
                    // If the user's cached credentials are valid, the OptionalPendingResult will be "done"
                    // and the GoogleSignInResult will be available instantly.
                    Log.d(TAG, "Got cached sign-in");
                    GoogleSignInResult result = opr.get();
                    handleSignInResult(result);
                } else {
                    // If the user has not previously signed in on this device or the sign-in has expired,
                    // this asynchronous branch will attempt to sign in the user silently.  Cross-device
                    // single sign-on will occur in this branch.
                    showProgressDialog();
                    opr.setResultCallback(new ResultCallback<GoogleSignInResult>() {
                        @Override
                        public void onResult(GoogleSignInResult googleSignInResult) {
                            hideProgressDialog();
                            handleSignInResult(googleSignInResult);
                        }
                    });
                }
            }


            private void showProgressDialog() {
                if (mProgressDialog == null) {

                    mProgressDialog.setIndeterminate(true);
                }

                mProgressDialog.show();
            }

            private void hideProgressDialog() {
                if (mProgressDialog != null && mProgressDialog.isShowing()) {
                    mProgressDialog.hide();
                }
            }

            private void updateUI(boolean isSignedIn) {
                if (isSignedIn) {
                    btnSignIn.setVisibility(View.GONE);
                    btnSignOut.setVisibility(View.VISIBLE);
                    btnRevokeAccess.setVisibility(View.VISIBLE);
                    llProfileLayout.setVisibility(View.VISIBLE);
                } else {
                    btnSignIn.setVisibility(View.VISIBLE);
                    btnSignOut.setVisibility(View.GONE);
                    btnRevokeAccess.setVisibility(View.GONE);
                    llProfileLayout.setVisibility(View.GONE);
                }
            }

            private void handleSignInResult(GoogleSignInResult result) {
                Log.d(TAG, "handleSignInResult:" + result.isSuccess());
                if (result.isSuccess()) {
                    // Signed in successfully, show authenticated UI.
                    GoogleSignInAccount acct = result.getSignInAccount();

                    Log.e(TAG, "display name: " + acct.getDisplayName());

                    String personName = acct.getDisplayName();
                    String personPhotoUrl = acct.getPhotoUrl().toString();
                    String email = acct.getEmail();

                    Log.e(TAG, "Name: " + personName + ", email: " + email
                            + ", Image: " + personPhotoUrl);

                    txtName.setText(personName);
                    txtEmail.setText(email);
                    Glide.with(getApplicationContext()).load(personPhotoUrl)
                            .thumbnail(0.5f)
                            .crossFade()
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(imgProfilePic);

                    updateUI(true);
                } else {
                    // Signed out, show unauthenticated UI.
                    updateUI(false);
                }
            }

            @Override
            public void onError(FacebookException exception) {
            }
        });

    }

    private void getKeyHash() {

        PackageInfo info;
        try {
            info = getPackageManager().getPackageInfo("com.grademojo.forex.Main7Activity", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md;
                md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String something = new String(Base64.encode(md.digest(), 0));
                //String something = new String(Base64.encodeBytes(md.digest()));
                Log.e("hash key", something);
            }
        } catch (PackageManager.NameNotFoundException e1) {
            Log.e("name not found", e1.toString());
        } catch (NoSuchAlgorithmException e) {
            Log.e("no such an algorithm", e.toString());
        } catch (Exception e) {
            Log.e("exception", e.toString());
        }
    }

    public void RequestData(){
        GraphRequest request = GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(JSONObject object, GraphResponse response) {

                JSONObject json = response.getJSONObject();
                System.out.println("Json data :"+json);
                try {
                    if(json != null){
                        String text = "Name"+json.getString("name")+"Email : "+json.getString("email")+"Profile link : "+json.getString("link");
                        // details_txt.setText(Html.fromHtml(text));
                        //  details_txt.setText(json.getString(text));
      //                  profile.setProfileId(json.getString("id"));
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        Bundle parameters = new Bundle();
        parameters.putString("fields", "id,name,link,email,picture");
        request.setParameters(parameters);
        request.executeAsync();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }


    public void click_card_image(View v) {
        if (v == card_view_facebook) {

            login.performClick();
        }
    }
    public void click_image(View v) {
        if (v == face_image) {
            login.performClick();
        }
    }

    public void click_card_image1(View v) {
        if (v == card_view_google_login) {

            google_text_view_login.performClick();
        }
    }
    public void click_image1(View v) {
        if (v == google_image) {
            google_text_view_login.performClick();
        }



//
//        image_fb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = new Intent(Main7Activity.this,Facebook_integration.class);
//                startActivity(i);
//            }
//        });


    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Log.d(TAG, "onConnectionFailed:" + connectionResult);
        
    }



    }

