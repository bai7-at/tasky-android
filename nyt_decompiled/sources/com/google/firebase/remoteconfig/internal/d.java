package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import defpackage.gj2;
import defpackage.ij2;
import java.util.Date;

/* loaded from: classes3.dex */
public class d {
    static final Date d = new Date(-1);
    static final Date e = new Date(-1);
    private final SharedPreferences a;
    private final Object b = new Object();
    private final Object c = new Object();

    static class a {
        private int a;
        private Date b;

        a(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        Date a() {
            return this.b;
        }

        int b() {
            return this.a;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public gj2 c() {
        f a2;
        synchronized (this.b) {
            long j = this.a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.a.getInt("last_fetch_status", 0);
            a2 = f.b().c(i).d(j).b(new ij2.b().d(this.a.getLong("fetch_timeout_in_seconds", 60L)).e(this.a.getLong("minimum_fetch_interval_in_seconds", c.j)).c()).a();
        }
        return a2;
    }

    String d() {
        return this.a.getString("last_fetch_etag", null);
    }

    Date e() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    void f() {
        g(0, e);
    }

    void g(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void h(ij2 ij2Var) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", ij2Var.a()).putLong("minimum_fetch_interval_in_seconds", ij2Var.b()).commit();
        }
    }

    void i(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void j() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void k(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void l() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
