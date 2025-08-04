// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// fix: java.lang.NoSuchMethodError: 'java.lang.String org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFileName(java.lang.String)'
buildscript {

    configurations.getByName("classpath") {
        resolutionStrategy {
            force("org.apache.commons:commons-compress:1.27.1")
        }
    }
}