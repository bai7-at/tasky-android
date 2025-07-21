package zendesk.core;

import com.google.gson.JsonElement;
import defpackage.r48;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
class ZendeskSettingsStorage implements SettingsStorage {
    private static final String LAST_UPDATE = "last_settings_update";
    private static final String RAWSETTTINGS_KEYSET = "rawsettings_keyset";
    private final BaseStorage settingsStorage;

    ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean areSettingsUpToDate(long j, TimeUnit timeUnit) {
        Long l;
        synchronized (this.settingsStorage) {
            l = (Long) this.settingsStorage.get(LAST_UPDATE, Long.class);
        }
        if (l == null || l.longValue() == -1) {
            return false;
        }
        return System.currentTimeMillis() - l.longValue() < TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }

    @Override // zendesk.core.SettingsStorage
    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    @Override // zendesk.core.SettingsStorage
    public Map<String, JsonElement> getRawSettings() {
        HashMap hashMap;
        synchronized (this.settingsStorage) {
            try {
                hashMap = new HashMap();
                Set<String> set = (Set) this.settingsStorage.get(RAWSETTTINGS_KEYSET, Set.class);
                if (set != null) {
                    for (String str : set) {
                        if (str != null) {
                            hashMap.put(str, this.settingsStorage.get(str, JsonElement.class));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // zendesk.core.SettingsStorage
    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = (E) this.settingsStorage.get(str, cls);
        }
        return e;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean hasStoredSettings() {
        boolean b;
        synchronized (this.settingsStorage) {
            b = r48.b(this.settingsStorage.get(LAST_UPDATE));
        }
        return b;
    }

    @Override // zendesk.core.SettingsStorage
    public void storeRawSettings(Map<String, JsonElement> map) {
        synchronized (this.settingsStorage) {
            try {
                this.settingsStorage.put(LAST_UPDATE, Long.valueOf(System.currentTimeMillis()));
                for (Map.Entry<String, JsonElement> entry : map.entrySet()) {
                    this.settingsStorage.put(entry.getKey(), entry.getValue());
                }
                this.settingsStorage.put(RAWSETTTINGS_KEYSET, map.keySet());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
