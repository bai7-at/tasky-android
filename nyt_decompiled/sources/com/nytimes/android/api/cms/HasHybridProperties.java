package com.nytimes.android.api.cms;

import com.nytimes.android.hybrid.model.HybridImageCrop;
import com.nytimes.android.hybrid.model.HybridSubResource;
import com.nytimes.android.resourcedownloader.model.HybridProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public interface HasHybridProperties {

    public static final class DefaultImpls {
        public static HybridProperties toHybridProperties(HasHybridProperties hasHybridProperties) {
            List list;
            List<HybridResource> hybridResources = hasHybridProperties.getHybridResources();
            ArrayList arrayList = new ArrayList(i.w(hybridResources, 10));
            for (HybridResource hybridResource : hybridResources) {
                arrayList.add(new HybridSubResource(hybridResource.getTarget(), hybridResource.isRequired()));
            }
            List<HybridImage> hybridImages = hasHybridProperties.getHybridImages();
            ArrayList arrayList2 = new ArrayList(i.w(hybridImages, 10));
            Iterator<T> it2 = hybridImages.iterator();
            while (it2.hasNext()) {
                List<HybridCrop> crops = ((HybridImage) it2.next()).getCrops();
                if (crops != null) {
                    List<HybridCrop> list2 = crops;
                    list = new ArrayList(i.w(list2, 10));
                    for (HybridCrop hybridCrop : list2) {
                        String target = hybridCrop.getTarget();
                        if (target == null) {
                            target = "";
                        }
                        list.add(new HybridImageCrop(target, hybridCrop.getMinViewportWidth()));
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = i.l();
                }
                arrayList2.add(new com.nytimes.android.hybrid.model.HybridImage(list));
            }
            return new HybridProperties(arrayList, arrayList2);
        }
    }

    String getHybridBody();

    List<HybridImage> getHybridImages();

    List<HybridResource> getHybridResources();

    HybridProperties toHybridProperties();
}
