package com.apollographql.apollo.api.json;

import defpackage.b22;
import defpackage.zt3;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes2.dex */
public interface JsonReader extends Closeable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Token[] $VALUES;
        public static final Token BEGIN_ARRAY = new Token("BEGIN_ARRAY", 0);
        public static final Token END_ARRAY = new Token("END_ARRAY", 1);
        public static final Token BEGIN_OBJECT = new Token("BEGIN_OBJECT", 2);
        public static final Token END_OBJECT = new Token("END_OBJECT", 3);
        public static final Token NAME = new Token("NAME", 4);
        public static final Token STRING = new Token("STRING", 5);
        public static final Token NUMBER = new Token("NUMBER", 6);
        public static final Token LONG = new Token("LONG", 7);
        public static final Token BOOLEAN = new Token("BOOLEAN", 8);
        public static final Token NULL = new Token("NULL", 9);
        public static final Token END_DOCUMENT = new Token("END_DOCUMENT", 10);
        public static final Token ANY = new Token("ANY", 11);

        private static final /* synthetic */ Token[] $values() {
            return new Token[]{BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, LONG, BOOLEAN, NULL, END_DOCUMENT, ANY};
        }

        static {
            Token[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Token(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) $VALUES.clone();
        }
    }

    Void U0();

    JsonReader beginArray();

    JsonReader beginObject();

    JsonReader endArray();

    JsonReader endObject();

    List getPath();

    boolean hasNext();

    zt3 j1();

    int l1(List list);

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    Token peek();

    void q();

    void skipValue();
}
