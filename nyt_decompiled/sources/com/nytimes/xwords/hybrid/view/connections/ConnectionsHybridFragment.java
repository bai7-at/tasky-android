package com.nytimes.xwords.hybrid.view.connections;

import android.os.Build;
import android.os.Bundle;
import com.nytimes.xwords.hybrid.utils.ArchivePath;
import com.nytimes.xwords.hybrid.view.BaseHybridFragment;
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
public final class ConnectionsHybridFragment extends BaseHybridFragment {
    public static final a Q = new a(null);
    public static final int S = 8;
    private final String L;
    private final String M;
    private final c04 N;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ConnectionsHybridFragment() {
        super(pi6.hybrid_view);
        this.L = "Connections";
        this.M = "connections";
        this.N = c.a(new qs2() { // from class: com.nytimes.xwords.hybrid.view.connections.ConnectionsHybridFragment$archivePath$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ArchivePath mo865invoke() {
                Serializable serializable;
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle arguments = ConnectionsHybridFragment.this.getArguments();
                    if (arguments == null) {
                        return null;
                    }
                    serializable = arguments.getSerializable("ARG_ARCHIVE_PATH", ArchivePath.class);
                    return (ArchivePath) serializable;
                }
                Bundle arguments2 = ConnectionsHybridFragment.this.getArguments();
                Serializable serializable2 = arguments2 != null ? arguments2.getSerializable("ARG_ARCHIVE_PATH") : null;
                if (serializable2 instanceof ArchivePath) {
                    return (ArchivePath) serializable2;
                }
                return null;
            }
        });
    }

    private final ArchivePath c2() {
        return (ArchivePath) this.N.getValue();
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public String H1() {
        return this.M;
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
        N1().setBackgroundColor(mx0.c(requireContext(), hd6.connectionsPrimary));
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z1(new PageEventReporter(F1(), "connections", this, K1()));
        getLifecycle().a(G1());
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public String u1() {
        return this.L;
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment
    public String z1() {
        String connections;
        String str;
        if (c2() != null) {
            String connections2 = q1().getConnections();
            ArchivePath c2 = c2();
            if (c2 == null || (str = c2.getPath()) == null) {
                str = "";
            }
            connections = connections2 + str;
        } else {
            connections = q1().getConnections();
        }
        return connections + "?entry=gamesApp&GAMES_connectionsRollout_1130=1_ConnectionsV2";
    }
}
