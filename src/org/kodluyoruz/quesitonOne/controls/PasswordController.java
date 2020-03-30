package org.kodluyoruz.quesitonOne.controls;

import org.kodluyoruz.quesitonOne.enums.AuthenticationDetail;

public class PasswordController {

    public static AuthenticationDetail returnLoginDetail(String email, String password) {
        if (email == null) {
            return AuthenticationDetail.NULL_MAIL;
        } else if (!email.contentEquals("@")) {
            return AuthenticationDetail.INVALID_EMAIL;
        } else if (password == null) {
            return AuthenticationDetail.NULL_PASSWORD;
        } else if (password.length() < 3) {
            return AuthenticationDetail.INVALID_PASSWORD;
        }
        return AuthenticationDetail.SUCCESS_LOGIN;
    }
}
