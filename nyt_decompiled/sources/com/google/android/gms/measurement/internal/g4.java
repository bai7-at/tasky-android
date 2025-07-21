package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g4 {
    private final String a;
    private final Bundle b;
    private Bundle c;
    final /* synthetic */ k4 d;

    public g4(k4 k4Var, String str, Bundle bundle) {
        this.d = k4Var;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }

    public final Bundle a() {
        char c;
        if (this.c == null) {
            String string = this.d.k().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString(QueryKeys.IS_NEW_USER);
                            String string3 = jSONObject.getString(QueryKeys.TOKEN);
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals(QueryKeys.SUBDOMAIN)) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString(QueryKeys.INTERNAL_REFERRER));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(QueryKeys.INTERNAL_REFERRER)));
                            } else if (c != 2) {
                                this.d.a.o().n().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString(QueryKeys.INTERNAL_REFERRER)));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.d.a.o().n().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    this.d.a.o().n().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.d.k().edit();
        if (bundle.size() == 0) {
            edit.remove(this.a);
        } else {
            String str = this.a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(QueryKeys.IS_NEW_USER, str2);
                        jSONObject.put(QueryKeys.INTERNAL_REFERRER, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(QueryKeys.TOKEN, "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put(QueryKeys.TOKEN, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(QueryKeys.TOKEN, QueryKeys.SUBDOMAIN);
                        } else {
                            this.d.a.o().n().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.d.a.o().n().b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle;
    }
}
