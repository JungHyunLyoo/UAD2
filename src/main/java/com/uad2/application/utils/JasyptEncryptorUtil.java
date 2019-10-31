package com.uad2.application.utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptEncryptorUtil {
    private static final String ENCRYPT_ALGORITHM = "PBEWithMD5AndDES";
    private static final String ENCRYPT_PASSWORD = System.getProperty("jasypt.encryptor.password");
    private static StandardPBEStringEncryptor pbeEnc;

    public static String encrypt(String str){
        if(pbeEnc == null){
            initPbeEnc();
        }
        return pbeEnc.encrypt(str);
    }

    public static String decrypt(String str){
        if(pbeEnc == null){
            initPbeEnc();
        }
        return pbeEnc.decrypt(str);
    }
    
    private static void initPbeEnc(){        
        this.pbeEnc = new StandardPBEStringEncryptor();
        this.pbeEnc.setAlgorithm(ENCRYPT_ALGORITHM);
        this.pbeEnc.setPassword(ENCRYPT_PASSWORD);        
    }
}
