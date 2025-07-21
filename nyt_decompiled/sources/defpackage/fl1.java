package defpackage;

/* loaded from: classes3.dex */
public abstract class fl1 {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086 A[Catch: IOException | XmlPullParserException -> 0x0013, TryCatch #0 {IOException | XmlPullParserException -> 0x0013, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0016, B:13:0x0028, B:15:0x008a, B:18:0x0031, B:22:0x0041, B:24:0x0045, B:30:0x0053, B:38:0x007b, B:40:0x0081, B:42:0x0086, B:44:0x0062, B:47:0x006c), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map a(android.content.Context r8, int r9) {
        /*
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L13
            if (r8 != 0) goto L16
            java.lang.String r8 = "Could not find the resources of the current context while trying to set defaults from an XML."
            android.util.Log.e(r0, r8)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r8 = move-exception
            goto L8f
        L16:
            android.content.res.XmlResourceParser r8 = r8.getXml(r9)     // Catch: java.lang.Throwable -> L13
            int r9 = r8.getEventType()     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L22:
            r6 = 1
            if (r9 == r6) goto L94
            r7 = 2
            if (r9 != r7) goto L2e
            java.lang.String r3 = r8.getName()     // Catch: java.lang.Throwable -> L13
            goto L8a
        L2e:
            r7 = 3
            if (r9 != r7) goto L4e
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "entry"
            boolean r9 = r9.equals(r3)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto L4c
            if (r4 == 0) goto L45
            if (r5 == 0) goto L45
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L13
            goto L4a
        L45:
            java.lang.String r9 = "An entry in the defaults XML has an invalid key and/or value tag."
            android.util.Log.w(r0, r9)     // Catch: java.lang.Throwable -> L13
        L4a:
            r4 = r2
            r5 = r4
        L4c:
            r3 = r2
            goto L8a
        L4e:
            r7 = 4
            if (r9 != r7) goto L8a
            if (r3 == 0) goto L8a
            int r9 = r3.hashCode()     // Catch: java.lang.Throwable -> L13
            r7 = 106079(0x19e5f, float:1.48648E-40)
            if (r9 == r7) goto L6c
            r7 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r9 == r7) goto L62
            goto L76
        L62:
            java.lang.String r9 = "value"
            boolean r9 = r3.equals(r9)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto L76
            r9 = r6
            goto L77
        L6c:
            java.lang.String r9 = "key"
            boolean r9 = r3.equals(r9)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto L76
            r9 = 0
            goto L77
        L76:
            r9 = -1
        L77:
            if (r9 == 0) goto L86
            if (r9 == r6) goto L81
            java.lang.String r9 = "Encountered an unexpected tag while parsing the defaults XML."
            android.util.Log.w(r0, r9)     // Catch: java.lang.Throwable -> L13
            goto L8a
        L81:
            java.lang.String r5 = r8.getText()     // Catch: java.lang.Throwable -> L13
            goto L8a
        L86:
            java.lang.String r4 = r8.getText()     // Catch: java.lang.Throwable -> L13
        L8a:
            int r9 = r8.next()     // Catch: java.lang.Throwable -> L13
            goto L22
        L8f:
            java.lang.String r9 = "Encountered an error while parsing the defaults XML file."
            android.util.Log.e(r0, r9, r8)
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.a(android.content.Context, int):java.util.Map");
    }
}
