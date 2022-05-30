/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class admin {
    private String tkadmin;
    private String mkadmin;

    public admin() {
    }

    public admin(String tkadmin, String mkadmin) {
        this.tkadmin = tkadmin;
        this.mkadmin = mkadmin;
    }

    public String getTkadmin() {
        return tkadmin;
    }

    public void setTkadmin(String tkadmin) {
        this.tkadmin = tkadmin;
    }

    public String getMkadmin() {
        return mkadmin;
    }

    public void setMkadmin(String mkadmin) {
        this.mkadmin = mkadmin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.tkadmin);
        hash = 23 * hash + Objects.hashCode(this.mkadmin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final admin other = (admin) obj;
        if (!Objects.equals(this.tkadmin, other.tkadmin)) {
            return false;
        }
        if (!Objects.equals(this.mkadmin, other.mkadmin)) {
            return false;
        }
        return true;
    }
    
    
}
