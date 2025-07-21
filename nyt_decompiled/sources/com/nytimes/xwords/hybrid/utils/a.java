package com.nytimes.xwords.hybrid.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.fragment.app.r;
import com.nytimes.xwords.hybrid.view.connections.ConnectionsErrorFragment;
import com.nytimes.xwords.hybrid.view.connections.ConnectionsHybridFragment;
import com.nytimes.xwords.hybrid.view.letterboxed.LetterBoxedErrorFragment;
import com.nytimes.xwords.hybrid.view.spellingbee.SpellingBeeHybridFragment;
import com.nytimes.xwords.hybrid.view.sudoku.SudokuErrorFragment;
import com.nytimes.xwords.hybrid.view.tiles.TilesErrorFragment;
import defpackage.bh6;
import defpackage.du8;
import defpackage.h50;
import defpackage.mx0;
import defpackage.nm6;
import defpackage.s22;
import defpackage.si9;
import defpackage.ty7;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.e;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class a {
    private static final Regex a = new Regex("(?<=/)(\\d{4})-(\\d{2})-(\\d{2})(?=/.|$)");

    public static final ArchivePath a(String str) {
        zq3.h(str, "<this>");
        e c = Regex.c(a, str, 0, 2, null);
        if (c == null) {
            return null;
        }
        try {
            e.b a2 = c.a();
            return ArchivePath.O.a(Integer.parseInt((String) a2.a().b().get(1)), Integer.parseInt((String) a2.a().b().get(2)), Integer.parseInt((String) a2.a().b().get(3)));
        } catch (Exception e) {
            ul8.a.m(e, "No archive path in " + str, new Object[0]);
            return null;
        }
    }

    public static final void b(Fragment fragment, String str) {
        Fragment connectionsHybridFragment;
        FragmentManager supportFragmentManager;
        r p;
        r b;
        r g;
        zq3.h(fragment, "<this>");
        zq3.h(str, "urlString");
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (path == null) {
            path = "";
        }
        Pair a2 = du8.a(path, parse.getQuery());
        String str2 = (String) a2.a();
        String str3 = (String) a2.b();
        zq3.e(str2);
        if (h.P(str2, "puzzles/spelling-bee", false, 2, null)) {
            connectionsHybridFragment = SpellingBeeHybridFragment.Z.a(a(str2), str3);
        } else if (h.P(str2, "games/wordle/index.html", false, 2, null)) {
            connectionsHybridFragment = new SpellingBeeHybridFragment();
        } else {
            if (h.P(str2, "connections/archive", false, 2, null)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("nytxwd://connections/archive"));
                    intent.setFlags(67108864);
                    fragment.startActivity(intent);
                    return;
                } catch (Exception e) {
                    ul8.a.f(e, "Error launching connections deeplink", new Object[0]);
                    f requireActivity = fragment.requireActivity();
                    zq3.g(requireActivity, "requireActivity(...)");
                    c(requireActivity, str);
                    return;
                }
            }
            if (!h.P(str2, "connections", false, 2, null)) {
                f requireActivity2 = fragment.requireActivity();
                zq3.g(requireActivity2, "requireActivity(...)");
                c(requireActivity2, str);
                return;
            }
            connectionsHybridFragment = new ConnectionsHybridFragment();
        }
        f requireActivity3 = fragment.requireActivity();
        f fVar = requireActivity3 != null ? requireActivity3 : null;
        if (fVar == null || (supportFragmentManager = fVar.getSupportFragmentManager()) == null || (p = supportFragmentManager.p()) == null || (b = p.b(bh6.hybrid_container, connectionsHybridFragment)) == null || (g = b.g("")) == null) {
            return;
        }
        g.h();
    }

    private static final void c(Context context, String str) {
        try {
            mx0.m(context, new Intent("android.intent.action.VIEW", Uri.parse(str)), null);
        } catch (ActivityNotFoundException e) {
            ul8.a.f(e, "Error launching url " + str, new Object[0]);
            Toast.makeText(context, context.getString(nm6.no_browser_message), 0).show();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void d(Fragment fragment, ErrorType errorType, String str) {
        Fragment fragment2;
        zq3.h(fragment, "<this>");
        zq3.h(errorType, "errorType");
        zq3.h(str, "gameName");
        switch (str.hashCode()) {
            case -1807606601:
                if (str.equals("Sudoku")) {
                    fragment2 = s22.b.a(errorType, SudokuErrorFragment.class);
                    break;
                }
                fragment2 = null;
                break;
            case -1698224605:
                if (str.equals("Wordle")) {
                    fragment2 = h50.b.a(errorType, si9.class);
                    break;
                }
                fragment2 = null;
                break;
            case -1408259280:
                if (str.equals("Letter Boxed")) {
                    fragment2 = s22.b.a(errorType, LetterBoxedErrorFragment.class);
                    break;
                }
                fragment2 = null;
                break;
            case -902494923:
                if (str.equals("Connections")) {
                    fragment2 = s22.b.a(errorType, ConnectionsErrorFragment.class);
                    break;
                }
                fragment2 = null;
                break;
            case -681796324:
                if (str.equals("Spelling Bee")) {
                    fragment2 = h50.b.a(errorType, ty7.class);
                    break;
                }
                fragment2 = null;
                break;
            case 80810853:
                if (str.equals("Tiles")) {
                    fragment2 = s22.b.a(errorType, TilesErrorFragment.class);
                    break;
                }
                fragment2 = null;
                break;
            case 1117365136:
                if (str.equals("Debug Settings")) {
                    fragment2 = h50.b.a(errorType, ty7.class);
                    break;
                }
                fragment2 = null;
                break;
            default:
                fragment2 = null;
                break;
        }
        if (fragment2 != null) {
            try {
                fragment.getParentFragmentManager().p().q(bh6.hybrid_container, fragment2).h();
            } catch (IllegalStateException e) {
                ul8.a.f(e, "Fragment Transaction Error occurred", new Object[0]);
                ww8 ww8Var = ww8.a;
            }
        }
    }
}
