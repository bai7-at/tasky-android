package com.nytimes.android.api.cms;

import java.util.HashMap;
import java.util.Iterator;

@Deprecated
/* loaded from: classes3.dex */
public class SectionConfig extends HashMap<String, SectionConfigEntry> {
    public int getDefaultCount() {
        Iterator<SectionConfigEntry> it2 = values().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().isDefaultSection()) {
                i++;
            }
        }
        return i;
    }

    public boolean isDefaultSection(String str) {
        SectionConfigEntry sectionConfigEntry = get(str);
        return sectionConfigEntry != null && sectionConfigEntry.isDefaultSection();
    }
}
