package com.google.android.exoplayer2.database;

import android.database.SQLException;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }
}
