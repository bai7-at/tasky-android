package com.nytimes.android.external.cache3;

/* loaded from: classes4.dex */
public enum RemovalCause {
    EXPLICIT { // from class: com.nytimes.android.external.cache3.RemovalCause.1
        @Override // com.nytimes.android.external.cache3.RemovalCause
        boolean wasEvicted() {
            return false;
        }
    },
    REPLACED { // from class: com.nytimes.android.external.cache3.RemovalCause.2
        @Override // com.nytimes.android.external.cache3.RemovalCause
        boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED { // from class: com.nytimes.android.external.cache3.RemovalCause.3
        @Override // com.nytimes.android.external.cache3.RemovalCause
        boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED { // from class: com.nytimes.android.external.cache3.RemovalCause.4
        @Override // com.nytimes.android.external.cache3.RemovalCause
        boolean wasEvicted() {
            return true;
        }
    },
    SIZE { // from class: com.nytimes.android.external.cache3.RemovalCause.5
        @Override // com.nytimes.android.external.cache3.RemovalCause
        boolean wasEvicted() {
            return true;
        }
    };

    abstract boolean wasEvicted();
}
