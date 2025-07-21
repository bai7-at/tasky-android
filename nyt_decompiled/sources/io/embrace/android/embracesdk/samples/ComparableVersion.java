package io.embrace.android.embracesdk.samples;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Stack;

/* loaded from: classes5.dex */
class ComparableVersion implements Comparable<ComparableVersion> {
    private String canonical;
    private ListItem items;
    private String value;

    private interface Item {
        public static final int INTEGER_ITEM = 0;
        public static final int LIST_ITEM = 2;
        public static final int STRING_ITEM = 1;

        int compareTo(Item item);

        int getType();

        boolean isNull();
    }

    protected static class ListItem extends ArrayList implements Item {
        protected ListItem() {
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public int compareTo(Item item) {
            int compareTo;
            if (item == null) {
                if (size() == 0) {
                    return 0;
                }
                return ((Item) get(0)).compareTo(null);
            }
            int type2 = item.getType();
            if (type2 == 0) {
                return -1;
            }
            if (type2 == 1) {
                return 1;
            }
            if (type2 != 2) {
                throw new RuntimeException("invalid item: " + item.getClass());
            }
            Iterator<E> it2 = iterator();
            Iterator<E> it3 = ((ListItem) item).iterator();
            do {
                if (!it2.hasNext() && !it3.hasNext()) {
                    return 0;
                }
                Item item2 = it2.hasNext() ? (Item) it2.next() : null;
                Item item3 = it3.hasNext() ? (Item) it3.next() : null;
                compareTo = item2 == null ? item3 == null ? 0 : item3.compareTo(item2) * (-1) : item2.compareTo(item3);
            } while (compareTo == 0);
            return compareTo;
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public int getType() {
            return 2;
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public boolean isNull() {
            return size() == 0;
        }

        void normalize() {
            for (int size = size() - 1; size >= 0; size--) {
                Item item = (Item) get(size);
                if (item.isNull()) {
                    remove(size);
                } else if (!(item instanceof ListItem)) {
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (sb.length() > 0) {
                    sb.append(next instanceof ListItem ? '-' : '.');
                }
                sb.append(next);
            }
            return sb.toString();
        }
    }

    private static class StringItem implements Item {
        private static final Properties ALIASES;
        private static final List QUALIFIERS;
        private static final String RELEASE_VERSION_INDEX;
        private String value;

        static {
            List asList = Arrays.asList("alpha", "beta", "milestone", "rc", "snapshot", "", "sp");
            QUALIFIERS = asList;
            Properties properties = new Properties();
            ALIASES = properties;
            properties.put("ga", "");
            properties.put("final", "");
            properties.put("cr", "rc");
            RELEASE_VERSION_INDEX = String.valueOf(asList.indexOf(""));
        }

        StringItem(String str, boolean z) {
            if (z && str.length() == 1) {
                char charAt = str.charAt(0);
                if (charAt == 'a') {
                    str = "alpha";
                } else if (charAt == 'b') {
                    str = "beta";
                } else if (charAt == 'm') {
                    str = "milestone";
                }
            }
            this.value = ALIASES.getProperty(str, str);
        }

        public static String comparableQualifier(String str) {
            List list = QUALIFIERS;
            int indexOf = list.indexOf(str);
            if (indexOf != -1) {
                return String.valueOf(indexOf);
            }
            return list.size() + "-" + str;
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public int compareTo(Item item) {
            if (item == null) {
                return comparableQualifier(this.value).compareTo(RELEASE_VERSION_INDEX);
            }
            int type2 = item.getType();
            if (type2 == 0) {
                return -1;
            }
            if (type2 == 1) {
                return comparableQualifier(this.value).compareTo(comparableQualifier(((StringItem) item).value));
            }
            if (type2 == 2) {
                return -1;
            }
            throw new RuntimeException("invalid item: " + item.getClass());
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public int getType() {
            return 1;
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public boolean isNull() {
            return comparableQualifier(this.value).compareTo(RELEASE_VERSION_INDEX) == 0;
        }

        public String toString() {
            return this.value;
        }
    }

    public ComparableVersion(String str) {
        parseVersion(str);
    }

    private static Item parseItem(boolean z, String str) {
        return z ? new IntegerItem(str) : new StringItem(str, false);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ComparableVersion) && this.canonical.equals(((ComparableVersion) obj).canonical);
    }

    public int hashCode() {
        return this.canonical.hashCode();
    }

    public final void parseVersion(String str) {
        this.value = str;
        this.items = new ListItem();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ListItem listItem = this.items;
        Stack stack = new Stack();
        stack.push(listItem);
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if (charAt == '.') {
                if (i2 == i) {
                    listItem.add(IntegerItem.ZERO);
                } else {
                    listItem.add(parseItem(z, lowerCase.substring(i, i2)));
                }
                i = i2 + 1;
            } else if (charAt == '-') {
                if (i2 == i) {
                    listItem.add(IntegerItem.ZERO);
                } else {
                    listItem.add(parseItem(z, lowerCase.substring(i, i2)));
                }
                i = i2 + 1;
                ListItem listItem2 = new ListItem();
                listItem.add(listItem2);
                stack.push(listItem2);
                listItem = listItem2;
            } else if (Character.isDigit(charAt)) {
                if (!z && i2 > i) {
                    listItem.add(new StringItem(lowerCase.substring(i, i2), true));
                    ListItem listItem3 = new ListItem();
                    listItem.add(listItem3);
                    stack.push(listItem3);
                    listItem = listItem3;
                    i = i2;
                }
                z = true;
            } else {
                if (z && i2 > i) {
                    listItem.add(parseItem(true, lowerCase.substring(i, i2)));
                    ListItem listItem4 = new ListItem();
                    listItem.add(listItem4);
                    stack.push(listItem4);
                    listItem = listItem4;
                    i = i2;
                }
                z = false;
            }
        }
        if (lowerCase.length() > i) {
            listItem.add(parseItem(z, lowerCase.substring(i)));
        }
        while (!stack.isEmpty()) {
            ((ListItem) stack.pop()).normalize();
        }
        this.canonical = this.items.toString();
    }

    public String toString() {
        return this.value;
    }

    private static class IntegerItem implements Item {
        private static final BigInteger BIG_INTEGER_ZERO = new BigInteger("0");
        public static final IntegerItem ZERO = new IntegerItem();
        private final BigInteger value;

        private IntegerItem() {
            this.value = BIG_INTEGER_ZERO;
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public int compareTo(Item item) {
            if (item == null) {
                return !BIG_INTEGER_ZERO.equals(this.value) ? 1 : 0;
            }
            int type2 = item.getType();
            if (type2 == 0) {
                return this.value.compareTo(((IntegerItem) item).value);
            }
            if (type2 == 1 || type2 == 2) {
                return 1;
            }
            throw new RuntimeException("invalid item: " + item.getClass());
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public int getType() {
            return 0;
        }

        @Override // io.embrace.android.embracesdk.samples.ComparableVersion.Item
        public boolean isNull() {
            return BIG_INTEGER_ZERO.equals(this.value);
        }

        public String toString() {
            return this.value.toString();
        }

        IntegerItem(String str) {
            this.value = new BigInteger(str);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(ComparableVersion comparableVersion) {
        return this.items.compareTo(comparableVersion.items);
    }
}
