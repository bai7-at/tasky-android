package kotlin.collections.builders;

import defpackage.zq3;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SerializedCollection implements Externalizable {
    public static final a a = new a(null);
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SerializedCollection(Collection collection, int i) {
        zq3.h(collection, "collection");
        this.collection = collection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        List a2;
        zq3.h(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i2 = 0;
        if (i == 0) {
            List d = i.d(readInt);
            while (i2 < readInt) {
                d.add(objectInput.readObject());
                i2++;
            }
            a2 = i.a(d);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            Set c = b0.c(readInt);
            while (i2 < readInt) {
                c.add(objectInput.readObject());
                i2++;
            }
            a2 = b0.a(c);
        }
        this.collection = a2;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        zq3.h(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it2 = this.collection.iterator();
        while (it2.hasNext()) {
            objectOutput.writeObject(it2.next());
        }
    }
}
