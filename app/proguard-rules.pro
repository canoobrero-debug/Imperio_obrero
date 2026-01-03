-keep class com.cosmo.empire.economy.** { *; }
-keep class com.cosmo.empire.security.** { *; }
-dontwarn com.cosmo.empire.**
-keepclasseswithmembernames class * {
    native <methods>;
}
