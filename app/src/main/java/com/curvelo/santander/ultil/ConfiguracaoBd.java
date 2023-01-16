package com.curvelo.santander.ultil;


import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoBd {

    private static FirebaseAuth auth;

    public static FirebaseAuth firebaseautentificacao(){
        if (auth == null){
            auth = FirebaseAuth.getInstance();
        }
        return auth;
    }
}
