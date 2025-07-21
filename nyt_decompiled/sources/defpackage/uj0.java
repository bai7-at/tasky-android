package defpackage;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class uj0 implements CharacterIterator {
    private final CharSequence a;
    private final int b;
    private final int c;
    private int d;

    public uj0(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = i;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.d;
        if (i == this.c) {
            return (char) 65535;
        }
        return this.a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.d = this.b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            this.d = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.d = i3;
        return this.a.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.d + 1;
        this.d = i;
        int i2 = this.c;
        if (i < i2) {
            return this.a.charAt(i);
        }
        this.d = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.d;
        if (i <= this.b) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.d = i2;
        return this.a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.b;
        if (i > this.c || i2 > i) {
            throw new IllegalArgumentException("invalid position");
        }
        this.d = i;
        return current();
    }
}
