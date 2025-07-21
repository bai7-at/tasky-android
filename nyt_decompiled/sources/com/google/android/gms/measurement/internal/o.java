package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.google.android.gms.common.internal.AccountType;
import defpackage.mx0;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class o extends v5 {
    private long c;
    private String d;
    private AccountManager e;
    private Boolean f;
    private long g;

    o(a5 a5Var) {
        super(a5Var);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean f() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    final long k() {
        c();
        return this.g;
    }

    public final long l() {
        g();
        return this.c;
    }

    public final String m() {
        g();
        return this.d;
    }

    final void n() {
        c();
        this.f = null;
        this.g = 0L;
    }

    final boolean r() {
        Account[] result;
        c();
        long currentTimeMillis = this.a.p().currentTimeMillis();
        if (currentTimeMillis - this.g > 86400000) {
            this.f = null;
        }
        Boolean bool = this.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (mx0.a(this.a.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
            this.a.o().x().a("Permission error checking for dasher/unicorn accounts");
            this.g = currentTimeMillis;
            this.f = Boolean.FALSE;
            return false;
        }
        if (this.e == null) {
            this.e = AccountManager.get(this.a.zzau());
        }
        try {
            result = this.e.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.a.o().s().b("Exception checking account types", e);
        }
        if (result != null && result.length > 0) {
            this.f = Boolean.TRUE;
            this.g = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.e.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f = Boolean.TRUE;
            this.g = currentTimeMillis;
            return true;
        }
        this.g = currentTimeMillis;
        this.f = Boolean.FALSE;
        return false;
    }
}
