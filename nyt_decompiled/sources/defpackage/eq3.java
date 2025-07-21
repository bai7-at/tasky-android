package defpackage;

/* loaded from: classes4.dex */
public abstract class eq3 {
    private static final wt4 a = new a();
    private static final wt4 b = new b();
    private static final wt4 c = new c();

    public static final class a extends wt4 {
        a() {
            super(1, 2);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `_new_interests_data` (`id` INTEGER NOT NULL, `interest_type` TEXT NOT NULL, `interest_sub_type` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `promo_image_url` TEXT NOT NULL, `interest_content` TEXT NOT NULL, `is_opinion` INTEGER NOT NULL DEFAULT false, `is_editors_pick` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`id`))");
            sc8Var.B("INSERT INTO `_new_interests_data` (`id`,`interest_type`,`interest_sub_type`,`name`,`description`,`promo_image_url`,`interest_content`) SELECT `id`,`interest_type`,`interest_sub_type`,`name`,`description`,`promo_image_url`,`interest_content` FROM `interests_data`");
            sc8Var.B("DROP TABLE `interests_data`");
            sc8Var.B("ALTER TABLE `_new_interests_data` RENAME TO `interests_data`");
        }
    }

    public static final class b extends wt4 {
        b() {
            super(2, 3);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `_new_interests_data` (`id` INTEGER NOT NULL, `interest_type` TEXT NOT NULL, `interest_sub_type` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `promo_image_url` TEXT NOT NULL, `interest_content` TEXT NOT NULL, `is_opinion` INTEGER NOT NULL DEFAULT false, `is_editors_pick` INTEGER NOT NULL DEFAULT false,`auto_added_timestamp` INTEGER DEFAULT null, PRIMARY KEY(`id`))");
            sc8Var.B("INSERT INTO `_new_interests_data` (`id`,`interest_type`,`interest_sub_type`,`name`,`description`,`promo_image_url`,`interest_content`, `is_opinion`, `is_editors_pick`) SELECT `id`,`interest_type`, `interest_sub_type`, `name`,`description`,`promo_image_url`,`interest_content`, `is_opinion`, `is_editors_pick` FROM `interests_data`");
            sc8Var.B("DROP TABLE `interests_data`");
            sc8Var.B("ALTER TABLE `_new_interests_data` RENAME TO `interests_data`");
        }
    }

    public static final class c extends wt4 {
        c() {
            super(3, 4);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            sc8Var.B("CREATE TABLE IF NOT EXISTS `_new_interests_data` (`id` INTEGER NOT NULL, `interest_type` TEXT NOT NULL, `interest_sub_type` TEXT NOT NULL, `name` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL DEFAULT 0, `description` TEXT NOT NULL, `promo_image_url` TEXT NOT NULL,`interest_content` TEXT NOT NULL, `is_opinion` INTEGER NOT NULL DEFAULT false, `is_editors_pick` INTEGER NOT NULL DEFAULT false,`auto_added_timestamp` INTEGER DEFAULT null, PRIMARY KEY(`id`))");
            sc8Var.B("INSERT INTO `_new_interests_data` (`id`,`interest_type`,`interest_sub_type`,`name`,`description`,`promo_image_url`,`interest_content`, `is_opinion`, `is_editors_pick`, `auto_added_timestamp`) SELECT `id`,`interest_type`, `interest_sub_type`, `name`,`description`,`promo_image_url`,`interest_content`, `is_opinion`, `is_editors_pick`, `auto_added_timestamp` FROM `interests_data`");
            sc8Var.B("DROP TABLE `interests_data`");
            sc8Var.B("ALTER TABLE `_new_interests_data` RENAME TO `interests_data`");
        }
    }

    public static final wt4 a() {
        return a;
    }

    public static final wt4 b() {
        return b;
    }

    public static final wt4 c() {
        return c;
    }
}
