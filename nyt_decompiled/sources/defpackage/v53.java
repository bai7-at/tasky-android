package defpackage;

import androidx.lifecycle.n;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository;
import com.nytimes.android.growthui.regibundle.RegibundleConfigRepository;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class v53 {
    public final gy3 a(n nVar, Map map) {
        zq3.h(nVar, "savedStateHandle");
        zq3.h(map, "repositoryMap");
        DataConfigId dataConfigId = (DataConfigId) nVar.d("CONFIG_ID");
        gy3 gy3Var = (gy3) map.get(dataConfigId);
        if (gy3Var != null) {
            return gy3Var;
        }
        throw new NoSuchElementException("There is no repository defined for CONFIG_ID_KEY = " + dataConfigId);
    }

    public final PaywallConfigRepository b(n nVar, Map map) {
        zq3.h(nVar, "savedStateHandle");
        zq3.h(map, "repositoryMap");
        DataConfigId dataConfigId = (DataConfigId) nVar.d("CONFIG_ID");
        PaywallConfigRepository paywallConfigRepository = (PaywallConfigRepository) map.get(dataConfigId);
        if (paywallConfigRepository != null) {
            return paywallConfigRepository;
        }
        throw new NoSuchElementException("There is no repository defined for CONFIG_ID_KEY = " + dataConfigId);
    }

    public final PostAuthConfigRepository c(n nVar, Map map) {
        zq3.h(nVar, "savedStateHandle");
        zq3.h(map, "repositoryMap");
        DataConfigId dataConfigId = (DataConfigId) nVar.d("CONFIG_ID");
        PostAuthConfigRepository postAuthConfigRepository = (PostAuthConfigRepository) map.get(dataConfigId);
        if (postAuthConfigRepository != null) {
            return postAuthConfigRepository;
        }
        throw new NoSuchElementException("There is no repository defined for CONFIG_ID_KEY = " + dataConfigId);
    }

    public final RegibundleConfigRepository d(Map map) {
        zq3.h(map, "repositoryMap");
        RegibundleConfigRepository regibundleConfigRepository = (RegibundleConfigRepository) map.get(DataConfigId.Regibundle);
        if (regibundleConfigRepository != null) {
            return regibundleConfigRepository;
        }
        throw new NoSuchElementException("There is no repository defined for CONFIG_ID_KEY = Regibundle");
    }
}
