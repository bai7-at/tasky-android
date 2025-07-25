package org.threeten.bp;

import com.amazonaws.services.s3.internal.Constants;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.Era;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.zone.ZoneOffsetTransition;

/* loaded from: classes5.dex */
public final class LocalDate extends ChronoLocalDate implements Temporal, TemporalAdjuster, Serializable {
    static final long DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long serialVersionUID = 2942565459149668126L;
    private final short day;
    private final short month;
    private final int year;
    public static final LocalDate MIN = of(Year.MIN_VALUE, 1, 1);
    public static final LocalDate MAX = of(Year.MAX_VALUE, 12, 31);
    public static final TemporalQuery<LocalDate> FROM = new TemporalQuery<LocalDate>() { // from class: org.threeten.bp.LocalDate.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public LocalDate queryFrom(TemporalAccessor temporalAccessor) {
            return LocalDate.from(temporalAccessor);
        }
    };

    /* renamed from: org.threeten.bp.LocalDate$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$org$threeten$bp$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$org$threeten$bp$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private LocalDate(int i, int i2, int i3) {
        this.year = i;
        this.month = (short) i2;
        this.day = (short) i3;
    }

    private static LocalDate create(int i, Month month, int i2) {
        if (i2 <= 28 || i2 <= month.length(IsoChronology.INSTANCE.isLeapYear(i))) {
            return new LocalDate(i, month.getValue(), i2);
        }
        if (i2 == 29) {
            throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
        }
        throw new DateTimeException("Invalid date '" + month.name() + " " + i2 + "'");
    }

    public static LocalDate from(TemporalAccessor temporalAccessor) {
        LocalDate localDate = (LocalDate) temporalAccessor.query(TemporalQueries.localDate());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + ", type " + temporalAccessor.getClass().getName());
    }

    private int get0(TemporalField temporalField) {
        switch (AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.day;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.day - 1) / 7) + 1;
            case 4:
                int i = this.year;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.day - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Field too large for an int: " + temporalField);
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.month;
            case 11:
                throw new DateTimeException("Field too large for an int: " + temporalField);
            case 12:
                return this.year;
            case 13:
                return this.year >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }

    private long getProlepticMonth() {
        return (this.year * 12) + (this.month - 1);
    }

    private long monthsUntil(LocalDate localDate) {
        return (((localDate.getProlepticMonth() * 32) + localDate.getDayOfMonth()) - ((getProlepticMonth() * 32) + getDayOfMonth())) / 32;
    }

    public static LocalDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalDate of(int i, Month month, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        Jdk8Methods.requireNonNull(month, "month");
        ChronoField.DAY_OF_MONTH.checkValidValue(i2);
        return create(i, month, i2);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.checkValidValue(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.checkValidIntValue(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate ofYearDay(int i, int i2) {
        long j = i;
        ChronoField.YEAR.checkValidValue(j);
        ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean isLeapYear = IsoChronology.INSTANCE.isLeapYear(j);
        if (i2 != 366 || isLeapYear) {
            Month of = Month.of(((i2 - 1) / 31) + 1);
            if (i2 > (of.firstDayOfYear(isLeapYear) + of.length(isLeapYear)) - 1) {
                of = of.plus(1L);
            }
            return create(i, of, (i2 - of.firstDayOfYear(isLeapYear)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    static LocalDate readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static LocalDate resolvePreviousValid(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, IsoChronology.INSTANCE.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return of(i, i2, i3);
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return super.adjustInto(temporal);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.of(this, LocalTime.MIDNIGHT);
    }

    int compareTo0(LocalDate localDate) {
        int i = this.year - localDate.year;
        if (i != 0) {
            return i;
        }
        int i2 = this.month - localDate.month;
        return i2 == 0 ? this.day - localDate.day : i2;
    }

    long daysUntil(LocalDate localDate) {
        return localDate.toEpochDay() - toEpochDay();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && compareTo0((LocalDate) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public String format(DateTimeFormatter dateTimeFormatter) {
        return super.format(dateTimeFormatter);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? get0(temporalField) : super.get(temporalField);
    }

    public int getDayOfMonth() {
        return this.day;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(Jdk8Methods.floorMod(toEpochDay() + 3, 7) + 1);
    }

    public int getDayOfYear() {
        return (getMonth().firstDayOfYear(isLeapYear()) + this.day) - 1;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public Era getEra() {
        return super.getEra();
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? getProlepticMonth() : get0(temporalField) : temporalField.getFrom(this);
    }

    public Month getMonth() {
        return Month.of(this.month);
    }

    public int getMonthValue() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.year;
        return (i & (-2048)) ^ (((i << 11) + (this.month << 6)) + this.day);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? compareTo0((LocalDate) chronoLocalDate) > 0 : super.isAfter(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? compareTo0((LocalDate) chronoLocalDate) < 0 : super.isBefore(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean isEqual(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? compareTo0((LocalDate) chronoLocalDate) == 0 : super.isEqual(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.year);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return super.isSupported(temporalField);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        short s = this.month;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public LocalDate minusDays(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusDays(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusDays(j2);
    }

    public LocalDate minusMonths(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusMonths(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusMonths(j2);
    }

    public LocalDate minusWeeks(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusWeeks(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusWeeks(j2);
    }

    public LocalDate minusYears(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusYears(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusYears(j2);
    }

    public LocalDate plusDays(long j) {
        return j == 0 ? this : ofEpochDay(Jdk8Methods.safeAdd(toEpochDay(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.year * 12) + (this.month - 1) + j;
        return resolvePreviousValid(ChronoField.YEAR.checkValidIntValue(Jdk8Methods.floorDiv(j2, 12L)), Jdk8Methods.floorMod(j2, 12) + 1, this.day);
    }

    public LocalDate plusWeeks(long j) {
        return plusDays(Jdk8Methods.safeMultiply(j, 7));
    }

    public LocalDate plusYears(long j) {
        return j == 0 ? this : resolvePreviousValid(ChronoField.YEAR.checkValidIntValue(this.year + j), this.month, this.day);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        return temporalQuery == TemporalQueries.localDate() ? this : (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.rangeRefinedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        int i = AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.of(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.of(1L, lengthOfYear());
        }
        if (i == 3) {
            return ValueRange.of(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
        }
        if (i != 4) {
            return temporalField.range();
        }
        return ValueRange.of(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.year;
        long j2 = this.month;
        long j3 = 365 * j;
        long j4 = (j >= 0 ? j3 + (((3 + j) / 4) - ((99 + j) / 100)) + ((j + 399) / 400) : j3 - (((j / (-4)) - (j / (-100))) + (j / (-400)))) + (((367 * j2) - 362) / 12) + (this.day - 1);
        if (j2 > 2) {
            j4 = !isLeapYear() ? j4 - 2 : j4 - 1;
        }
        return j4 - DAYS_0000_TO_1970;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public String toString() {
        int i = this.year;
        short s = this.month;
        short s2 = this.day;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + Constants.MAXIMUM_UPLOAD_PARTS);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    public LocalDate withDayOfMonth(int i) {
        return this.day == i ? this : of(this.year, this.month, i);
    }

    public LocalDate withDayOfYear(int i) {
        return getDayOfYear() == i ? this : ofYearDay(this.year, i);
    }

    public LocalDate withMonth(int i) {
        if (this.month == i) {
            return this;
        }
        ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return resolvePreviousValid(this.year, i, this.day);
    }

    public LocalDate withYear(int i) {
        if (this.year == i) {
            return this;
        }
        ChronoField.YEAR.checkValidValue(i);
        return resolvePreviousValid(i, this.month, this.day);
    }

    void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    public static LocalDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, FROM);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        ZoneOffsetTransition transition;
        Jdk8Methods.requireNonNull(zoneId, "zone");
        LocalDateTime atTime = atTime(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset) && (transition = zoneId.getRules().getTransition(atTime)) != null && transition.isGap()) {
            atTime = transition.getDateTimeAfter();
        }
        return ZonedDateTime.of(atTime, zoneId);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public LocalDateTime atTime(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? compareTo0((LocalDate) chronoLocalDate) : super.compareTo(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public IsoChronology getChronology() {
        return IsoChronology.INSTANCE;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate from = from((TemporalAccessor) temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        switch (AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return daysUntil(from);
            case 2:
                return daysUntil(from) / 7;
            case 3:
                return monthsUntil(from);
            case 4:
                return monthsUntil(from) / 12;
            case 5:
                return monthsUntil(from) / 120;
            case 6:
                return monthsUntil(from) / 1200;
            case 7:
                return monthsUntil(from) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return from.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    public static LocalDate now(Clock clock) {
        Jdk8Methods.requireNonNull(clock, "clock");
        return ofEpochDay(Jdk8Methods.floorDiv(clock.instant().getEpochSecond() + clock.getZone().getRules().getOffset(r0).getTotalSeconds(), 86400L));
    }

    public LocalDateTime atTime(int i, int i2) {
        return atTime(LocalTime.of(i, i2));
    }

    public LocalDateTime atTime(int i, int i2, int i3) {
        return atTime(LocalTime.of(i, i2, i3));
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        ChronoField.DAY_OF_MONTH.checkValidValue(i3);
        return create(i, Month.of(i2), i3);
    }

    public LocalDateTime atTime(int i, int i2, int i3, int i4) {
        return atTime(LocalTime.of(i, i2, i3, i4));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public LocalDate minus(TemporalAmount temporalAmount) {
        return (LocalDate) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public LocalDate plus(TemporalAmount temporalAmount) {
        return (LocalDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public LocalDate with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return (LocalDate) temporalAdjuster;
        }
        return (LocalDate) temporalAdjuster.adjustInto(this);
    }

    public OffsetDateTime atTime(OffsetTime offsetTime) {
        return OffsetDateTime.of(LocalDateTime.of(this, offsetTime.toLocalTime()), offsetTime.getOffset());
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public LocalDate minus(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plus(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plus(j2, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public LocalDate plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    return plusWeeks(j);
                case 3:
                    return plusMonths(j);
                case 4:
                    return plusYears(j);
                case 5:
                    return plusYears(Jdk8Methods.safeMultiply(j, 10));
                case 6:
                    return plusYears(Jdk8Methods.safeMultiply(j, 100));
                case 7:
                    return plusYears(Jdk8Methods.safeMultiply(j, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Jdk8Methods.safeAdd(getLong(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalDate) temporalUnit.addTo(this, j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public LocalDate with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j);
            switch (AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                    return withDayOfMonth((int) j);
                case 2:
                    return withDayOfYear((int) j);
                case 3:
                    return plusWeeks(j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.year < 1) {
                        j = 1 - j;
                    }
                    return withYear((int) j);
                case 5:
                    return plusDays(j - getDayOfWeek().getValue());
                case 6:
                    return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return ofEpochDay(j);
                case 9:
                    return plusWeeks(j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    return withMonth((int) j);
                case 11:
                    return plusMonths(j - getLong(ChronoField.PROLEPTIC_MONTH));
                case 12:
                    return withYear((int) j);
                case 13:
                    return getLong(ChronoField.ERA) == j ? this : withYear(1 - this.year);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (LocalDate) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public Period until(ChronoLocalDate chronoLocalDate) {
        LocalDate from = from((TemporalAccessor) chronoLocalDate);
        long prolepticMonth = from.getProlepticMonth() - getProlepticMonth();
        int i = from.day - this.day;
        if (prolepticMonth > 0 && i < 0) {
            prolepticMonth--;
            i = (int) (from.toEpochDay() - plusMonths(prolepticMonth).toEpochDay());
        } else if (prolepticMonth < 0 && i > 0) {
            prolepticMonth++;
            i -= from.lengthOfMonth();
        }
        return Period.of(Jdk8Methods.safeToInt(prolepticMonth / 12), (int) (prolepticMonth % 12), i);
    }
}
