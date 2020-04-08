package org.kodluyoruz.quesitonOne.account;

import org.kodluyoruz.quesitonOne.impl.IAddress;
import org.kodluyoruz.quesitonOne.address.BusinessAddress;
import org.kodluyoruz.quesitonOne.address.HomeAddress;
import org.kodluyoruz.quesitonOne.controls.PasswordController;
import org.kodluyoruz.quesitonOne.enums.AuthenticationDetail;
import org.kodluyoruz.quesitonOne.enums.AuthenticationStatus;
import org.kodluyoruz.quesitonOne.exceptions.InvalidAuthenticationException;
import org.kodluyoruz.quesitonOne.manager.AddressManager;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    private User user;
    private List<Insurance> insuranceList;
    private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

    public Account(User user, List<Insurance> insuranceList, AuthenticationStatus authenticationStatus) {
        this.user = user;
        this.insuranceList = insuranceList;
        this.authenticationStatus = authenticationStatus;
    }

    public Account() {
    }

    public final void showUserInfo(User user) {
        if (user != null) {
            StringBuilder builder = new StringBuilder();
            builder.append("İsim :");
            builder.append(user.getName());
            builder.append("Soyisim : ");
            builder.append(user.getSurName());
            builder.append("Sisteme son giriş tarihi :");
            builder.append(user.getLastLoginToSystemDate());
            System.out.println(builder);
        } else {
            System.out.println("user null");
        }
    }

    public void loginUser(String email, String password) throws InvalidAuthenticationException {
        if (PasswordController.returnLoginDetail(email, password) == AuthenticationDetail.SUCCESS_LOGIN) {
            if (user != null) {
                if (user.getEmail() != null && user.getPassword() != null) {
                    if (email.equals(user.getEmail()) && password.equals(user.getName())) {
                        authenticationStatus = AuthenticationStatus.SUCCESS;
                    }
                }
            }

        } else {
            new InvalidAuthenticationException("Sing-in failed", new Exception());
            authenticationStatus = AuthenticationStatus.FAIL;
        }
        authenticationStatus = AuthenticationStatus.FAIL;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getUser().equals(account.getUser()) &&
                getInsuranceList().equals(account.getInsuranceList()) &&
                getAuthenticationStatus() == account.getAuthenticationStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getInsuranceList(), getAuthenticationStatus());
    }

    private void addUserAddress(IAddress address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            AddressManager.addUserAddress(user, new HomeAddress("Istanbul", "Arnavutköy", "Merkez mah", "D:5 B BLOK", "34275"));
            AddressManager.addUserAddress(user, new BusinessAddress("Istanbul", "Maltepe", "Cevizli mah", "D:27", "34600"));
        }
    }

    private void removeUserAddress(IAddress address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS)
            AddressManager.deleteUserAddress(user, address);
    }

    public abstract void createInsurancePolicy();


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }
}
