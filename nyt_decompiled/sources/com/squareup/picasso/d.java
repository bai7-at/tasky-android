package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.wd5;
import java.io.InputStream;

/* loaded from: classes4.dex */
class d extends r {
    private static final UriMatcher b;
    private final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    d(Context context) {
        this.a = context;
    }

    private InputStream j(p pVar) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = pVar.d;
        int match = b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.r
    public boolean c(p pVar) {
        Uri uri = pVar.d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(pVar.d) != -1;
    }

    @Override // com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        InputStream j = j(pVar);
        if (j == null) {
            return null;
        }
        return new r.a(wd5.l(j), Picasso.LoadedFrom.DISK);
    }
}
