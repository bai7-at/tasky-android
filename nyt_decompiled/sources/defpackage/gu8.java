package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class gu8 {
    private static gu8 d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    private static class a {
        boolean a;
        long b;

        a() {
        }
    }

    gu8(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static gu8 a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new gu8(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    private Location b() {
        Location c = er5.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c2 = er5.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c2 == null || c == null) ? c2 != null ? c2 : c : c2.getTime() > c.getTime() ? c2 : c;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private boolean e() {
        return this.c.b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        fu8 b = fu8.b();
        b.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.c == 1;
        long j2 = b.b;
        long j3 = b.a;
        b.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = b.b;
        if (j2 == -1 || j3 == -1) {
            j = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis > j3) {
                j2 = j4;
            } else if (currentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        aVar.a = z;
        aVar.b = j;
    }

    boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            f(b);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
