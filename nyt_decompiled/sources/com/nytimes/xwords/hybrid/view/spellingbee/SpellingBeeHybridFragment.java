package com.nytimes.xwords.hybrid.view.spellingbee;

import android.os.Build;
import android.os.Bundle;
import com.nytimes.xwords.hybrid.utils.ArchivePath;
import com.nytimes.xwords.hybrid.view.PageEventReporter;
import defpackage.c04;
import defpackage.hd6;
import defpackage.mx0;
import defpackage.pi6;
import defpackage.qs2;
import defpackage.wu2;
import defpackage.zq3;
import defpackage.zu2;
import java.io.Serializable;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes4.dex */
public final class SpellingBeeHybridFragment extends com.nytimes.xwords.hybrid.view.spellingbee.a {
    public static final a Z = new a(null);
    public static final int e0 = 8;
    private final String Q;
    private final String S;
    private final c04 X;
    private final c04 Y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SpellingBeeHybridFragment b(a aVar, ArchivePath archivePath, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                archivePath = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.a(archivePath, str);
        }

        public final SpellingBeeHybridFragment a(ArchivePath archivePath, String str) {
            SpellingBeeHybridFragment spellingBeeHybridFragment = new SpellingBeeHybridFragment();
            if (archivePath != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("ARG_ARCHIVE_PATH", archivePath);
                if (str != null) {
                    bundle.putString("ARG_QUERY", str);
                }
                spellingBeeHybridFragment.setArguments(bundle);
            }
            return spellingBeeHybridFragment;
        }

        private a() {
        }
    }

    public SpellingBeeHybridFragment() {
        super(pi6.hybrid_view);
        this.Q = "Spelling Bee";
        this.S = "spelling-bee";
        this.X = c.a(new qs2() { // from class: com.nytimes.xwords.hybrid.view.spellingbee.SpellingBeeHybridFragment$archivePath$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ArchivePath mo865invoke() {
                Serializable serializable;
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle arguments = SpellingBeeHybridFragment.this.getArguments();
                    if (arguments == null) {
                        return null;
                    }
                    serializable = arguments.getSerializable("ARG_ARCHIVE_PATH", ArchivePath.class);
                    return (ArchivePath) serializable;
                }
                Bundle arguments2 = SpellingBeeHybridFragment.this.getArguments();
                Serializable serializable2 = arguments2 != null ? arguments2.getSerializable("ARG_ARCHIVE_PATH") : null;
                if (serializable2 instanceof ArchivePath) {
                    return (ArchivePath) serializable2;
                }
                return null;
            }
        });
        this.Y = c.a(new qs2() { // from class: com.nytimes.xwords.hybrid.view.spellingbee.SpellingBeeHybridFragment$urlQuery$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                Bundle arguments = SpellingBeeHybridFragment.this.getArguments();
                if (arguments != null) {
                    return arguments.getString("ARG_QUERY");
                }
                return null;
            }
        });
    }

    private final ArchivePath c2() {
        return (ArchivePath) this.X.getValue();
    }

    private final String d2() {
        return (String) this.Y.getValue();
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public String H1() {
        return this.S;
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public boolean M1() {
        return true;
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public void P1(Bundle bundle, zu2 zu2Var, wu2 wu2Var, String str) {
        zq3.h(zu2Var, "userConfig");
        zq3.h(wu2Var, "hybridConfig");
        zq3.h(str, "hybridGameUrl");
        super.P1(bundle, zu2Var, wu2Var, str);
        N1().setBackgroundColor(mx0.c(requireContext(), hd6.spellingBeePrimary));
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z1(new PageEventReporter(F1(), "spelling-bee", this, K1()));
        getLifecycle().a(G1());
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public String u1() {
        return this.Q;
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public String z1() {
        String str;
        String spellingBeeUrl = q1().getSpellingBeeUrl();
        ArchivePath c2 = c2();
        String str2 = "";
        if (c2 == null || (str = c2.getPath()) == null) {
            str = "";
        }
        String d2 = d2();
        if (d2 != null) {
            String str3 = "?" + d2;
            if (str3 != null) {
                str2 = str3;
            }
        }
        return spellingBeeUrl + str + str2;
    }
}
