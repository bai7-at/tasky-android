package defpackage;

import androidx.compose.material.DrawerState;
import androidx.compose.material.SnackbarHostState;

/* loaded from: classes.dex */
public final class ka7 {
    private final DrawerState a;
    private final SnackbarHostState b;

    public ka7(DrawerState drawerState, SnackbarHostState snackbarHostState) {
        this.a = drawerState;
        this.b = snackbarHostState;
    }

    public final DrawerState a() {
        return this.a;
    }

    public final SnackbarHostState b() {
        return this.b;
    }
}
