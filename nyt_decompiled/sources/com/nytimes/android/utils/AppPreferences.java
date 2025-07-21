package com.nytimes.android.utils;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.preference.g;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.zq3;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* loaded from: classes4.dex */
public final class AppPreferences {
    public static final a Companion = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AppPreferences(Application application) {
        zq3.h(application, "application");
        SharedPreferences b = g.b(application);
        zq3.g(b, "getDefaultSharedPreferences(...)");
        this.a = b;
    }

    public final void b(String str, int i) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public final void c(String str, long j) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public final void d(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final void e(String str, Set set) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(set, "value");
        SharedPreferences.Editor edit = this.a.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    public final void f(String str, boolean z) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final void g(String str, long j) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    public final boolean h(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.a.contains(str);
    }

    public final Flow i(String str) {
        zq3.h(str, "keyForLong");
        return FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new AppPreferences$getLongFlowForKey$1(this, str, null)), Integer.MAX_VALUE, null, 2, null);
    }

    public final int j(String str, int i) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.a.getInt(str, i);
    }

    public final long k(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final String l(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences sharedPreferences = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String string = sharedPreferences.getString(str, str2);
        zq3.e(string);
        return string;
    }

    public final Set m(String str, Set set) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.a.getStringSet(str, set);
    }

    public final boolean n(String str, boolean z) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.a.getBoolean(str, z);
    }

    public final void o(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        zq3.h(onSharedPreferenceChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void p(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(str);
        edit.commit();
    }

    public final void q(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        zq3.h(onSharedPreferenceChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
