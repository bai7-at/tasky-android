package com.nytimes.android.recentlyviewed.room;

import com.nytimes.android.recentlyviewed.room.AssetDatabase;
import defpackage.c00;
import defpackage.sc8;
import defpackage.wt4;

/* loaded from: classes4.dex */
final class a extends wt4 {
    private final c00 a;

    public a() {
        super(7, 8);
        this.a = new AssetDatabase.a();
    }

    @Override // defpackage.wt4
    public void a(sc8 sc8Var) {
        sc8Var.B("CREATE TABLE IF NOT EXISTS `_new_assets` (`id` INTEGER NOT NULL, `headline` TEXT NOT NULL, `image_url` TEXT, `summary` TEXT NOT NULL, `asset_type` TEXT NOT NULL, `section_name` TEXT NOT NULL, `kicker` TEXT, `last_updated` TEXT NOT NULL, `last_accessed` TEXT NOT NULL, `comment_count` INTEGER NOT NULL, `url` TEXT, `uri` TEXT, `read_before_but_updated` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        sc8Var.B("INSERT INTO `_new_assets` (`id`,`headline`,`image_url`,`summary`,`asset_type`,`section_name`,`kicker`,`last_updated`,`last_accessed`,`comment_count`,`url`,`uri`,`read_before_but_updated`) SELECT `id`,`headline`,`image_url`,`summary`,`asset_type`,`section_name`,`kicker`,`last_updated`,`last_accessed`,`comment_count`,`url`,`uri`,`read_before_but_updated` FROM `assets`");
        sc8Var.B("DROP TABLE `assets`");
        sc8Var.B("ALTER TABLE `_new_assets` RENAME TO `assets`");
        this.a.a(sc8Var);
    }
}
