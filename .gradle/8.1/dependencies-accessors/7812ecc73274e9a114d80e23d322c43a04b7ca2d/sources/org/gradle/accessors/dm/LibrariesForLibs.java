package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final ActivityLibraryAccessors laccForActivityLibraryAccessors = new ActivityLibraryAccessors(owner);
    private final ApolloLibraryAccessors laccForApolloLibraryAccessors = new ApolloLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final NavigationLibraryAccessors laccForNavigationLibraryAccessors = new NavigationLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final SentryLibraryAccessors laccForSentryLibraryAccessors = new SentryLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for androidToolsBuildGradle (com.android.tools.build:gradle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidToolsBuildGradle() {
            return create("androidToolsBuildGradle");
    }

        /**
         * Creates a dependency provider for apolloGradle (com.apollographql.apollo:apollo-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApolloGradle() {
            return create("apolloGradle");
    }

        /**
         * Creates a dependency provider for aqsi (net.nomia.integration:allinone-aqsi)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAqsi() {
            return create("aqsi");
    }

        /**
         * Creates a dependency provider for assertjCore (org.assertj:assertj-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertjCore() {
            return create("assertjCore");
    }

        /**
         * Creates a dependency provider for atol (net.nomia.integration:kkt-atol)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAtol() {
            return create("atol");
    }

        /**
         * Creates a dependency provider for bcrypt (at.favre.lib:bcrypt)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBcrypt() {
            return create("bcrypt");
    }

        /**
         * Creates a dependency provider for benManes (com.github.ben-manes:gradle-versions-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBenManes() {
            return create("benManes");
    }

        /**
         * Creates a dependency provider for carbon (tk.zielony:carbon)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCarbon() {
            return create("carbon");
    }

        /**
         * Creates a dependency provider for cardview (androidx.cardview:cardview)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCardview() {
            return create("cardview");
    }

        /**
         * Creates a dependency provider for charts (com.github.PhilJay:MPAndroidChart)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCharts() {
            return create("charts");
    }

        /**
         * Creates a dependency provider for coil (io.coil-kt:coil-compose)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoil() {
            return create("coil");
    }

        /**
         * Creates a dependency provider for commons (commons-net:commons-net)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommons() {
            return create("commons");
    }

        /**
         * Creates a dependency provider for composeAnnotation (io.github.dilrajsingh1997:compose-annotation)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getComposeAnnotation() {
            return create("composeAnnotation");
    }

        /**
         * Creates a dependency provider for composeAnnotationProcessor (io.github.dilrajsingh1997:compose-annotation-processor)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getComposeAnnotationProcessor() {
            return create("composeAnnotationProcessor");
    }

        /**
         * Creates a dependency provider for composeReorderable (org.burnoutcrew.composereorderable:reorderable)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getComposeReorderable() {
            return create("composeReorderable");
    }

        /**
         * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getConstraintlayout() {
            return create("constraintlayout");
    }

        /**
         * Creates a dependency provider for core (androidx.core:core-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("core");
    }

        /**
         * Creates a dependency provider for dagger (com.google.dagger:hilt-android)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDagger() {
            return create("dagger");
    }

        /**
         * Creates a dependency provider for daggerCompiler (com.google.dagger:hilt-android-compiler)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDaggerCompiler() {
            return create("daggerCompiler");
    }

        /**
         * Creates a dependency provider for datastore (androidx.datastore:datastore-preferences)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDatastore() {
            return create("datastore");
    }

        /**
         * Creates a dependency provider for desugar (com.android.tools:desugar_jdk_libs)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDesugar() {
            return create("desugar");
    }

        /**
         * Creates a dependency provider for detekt (io.gitlab.arturbosch.detekt:detekt-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDetekt() {
            return create("detekt");
    }

        /**
         * Creates a dependency provider for deviceNames (com.jaredrummler:android-device-names)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDeviceNames() {
            return create("deviceNames");
    }

        /**
         * Creates a dependency provider for dnssd (com.github.andriydruk:dnssd)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDnssd() {
            return create("dnssd");
    }

        /**
         * Creates a dependency provider for firebaseAnalyticsGradle (com.google.firebase:firebase-crashlytics-gradle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFirebaseAnalyticsGradle() {
            return create("firebaseAnalyticsGradle");
    }

        /**
         * Creates a dependency provider for fragment (androidx.fragment:fragment-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFragment() {
            return create("fragment");
    }

        /**
         * Creates a dependency provider for googleServices (com.google.gms:google-services)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGoogleServices() {
            return create("googleServices");
    }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("gson");
    }

        /**
         * Creates a dependency provider for hiltAndroidGradle (com.google.dagger:hilt-android-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHiltAndroidGradle() {
            return create("hiltAndroidGradle");
    }

        /**
         * Creates a dependency provider for hiltCompiler (androidx.hilt:hilt-compiler)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHiltCompiler() {
            return create("hiltCompiler");
    }

        /**
         * Creates a dependency provider for indriya (tech.units:indriya)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIndriya() {
            return create("indriya");
    }

        /**
         * Creates a dependency provider for inject (javax.inject:javax.inject)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getInject() {
            return create("inject");
    }

        /**
         * Creates a dependency provider for jackson (com.fasterxml.jackson.module:jackson-module-kotlin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJackson() {
            return create("jackson");
    }

        /**
         * Creates a dependency provider for javapoet (com.squareup:javapoet)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJavapoet() {
            return create("javapoet");
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit");
    }

        /**
         * Creates a dependency provider for jwt (com.auth0.android:jwtdecode)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJwt() {
            return create("jwt");
    }

        /**
         * Creates a dependency provider for kktCore (net.nomia.integration:kkt-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKktCore() {
            return create("kktCore");
    }

        /**
         * Creates a dependency provider for kktEscpos (net.nomia.integration:kkt-escpos)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKktEscpos() {
            return create("kktEscpos");
    }

        /**
         * Creates a dependency provider for kotlinGradle (org.jetbrains.kotlin:kotlin-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinGradle() {
            return create("kotlinGradle");
    }

        /**
         * Creates a dependency provider for kotlinJson (org.jetbrains.kotlinx:kotlinx-serialization-json)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinJson() {
            return create("kotlinJson");
    }

        /**
         * Creates a dependency provider for kotlinReflect (org.jetbrains.kotlin:kotlin-reflect)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinReflect() {
            return create("kotlinReflect");
    }

        /**
         * Creates a dependency provider for kotlinxCoroutines (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinxCoroutines() {
            return create("kotlinxCoroutines");
    }

        /**
         * Creates a dependency provider for ksp (com.google.devtools.ksp:symbol-processing-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKsp() {
            return create("ksp");
    }

        /**
         * Creates a dependency provider for kstatemachine (io.github.nsk90:kstatemachine)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKstatemachine() {
            return create("kstatemachine");
    }

        /**
         * Creates a dependency provider for ktsh (com.jaredrummler:ktsh)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtsh() {
            return create("ktsh");
    }

        /**
         * Creates a dependency provider for legacy (androidx.legacy:legacy-support-v4)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLegacy() {
            return create("legacy");
    }

        /**
         * Creates a dependency provider for libfptr10 (ru.atol:libfptr10-aar)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibfptr10() {
            return create("libfptr10");
    }

        /**
         * Creates a dependency provider for libphonenumber (com.googlecode.libphonenumber:libphonenumber)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibphonenumber() {
            return create("libphonenumber");
    }

        /**
         * Creates a dependency provider for logger (net.nomia.util:logger)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLogger() {
            return create("logger");
    }

        /**
         * Creates a dependency provider for logging (com.squareup.okhttp3:logging-interceptor)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLogging() {
            return create("logging");
    }

        /**
         * Creates a dependency provider for lottie (com.airbnb.android:lottie-compose)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLottie() {
            return create("lottie");
    }

        /**
         * Creates a dependency provider for mapstruct (org.mapstruct:mapstruct)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMapstruct() {
            return create("mapstruct");
    }

        /**
         * Creates a dependency provider for mapstructProcessor (org.mapstruct:mapstruct-processor)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMapstructProcessor() {
            return create("mapstructProcessor");
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("material");
    }

        /**
         * Creates a dependency provider for moneta (org.javamoney:moneta)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMoneta() {
            return create("moneta");
    }

        /**
         * Creates a dependency provider for paging (androidx.paging:paging-runtime-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPaging() {
            return create("paging");
    }

        /**
         * Creates a dependency provider for pinView (io.github.chaosleung:pinview)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPinView() {
            return create("pinView");
    }

        /**
         * Creates a dependency provider for playCore (com.google.android.play:core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlayCore() {
            return create("playCore");
    }

        /**
         * Creates a dependency provider for playCoreKtx (com.google.android.play:core-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlayCoreKtx() {
            return create("playCoreKtx");
    }

        /**
         * Creates a dependency provider for plot (com.github.madrapps:plot)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlot() {
            return create("plot");
    }

        /**
         * Creates a dependency provider for result (com.michael-bull.kotlin-result:kotlin-result)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getResult() {
            return create("result");
    }

        /**
         * Creates a dependency provider for revealswipe (de.charlex.compose:revealswipe)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRevealswipe() {
            return create("revealswipe");
    }

        /**
         * Creates a dependency provider for roomCompiler (androidx.room:room-compiler)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRoomCompiler() {
            return create("roomCompiler");
    }

        /**
         * Creates a dependency provider for rxbinding (com.jakewharton.rxbinding4:rxbinding)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxbinding() {
            return create("rxbinding");
    }

        /**
         * Creates a dependency provider for saripaar (com.mobsandgeeks:android-saripaar)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSaripaar() {
            return create("saripaar");
    }

        /**
         * Creates a dependency provider for siUnits (si.uom:si-units)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSiUnits() {
            return create("siUnits");
    }

        /**
         * Creates a dependency provider for smartsale (net.nomia.integration:acquiring-smartsale)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSmartsale() {
            return create("smartsale");
    }

        /**
         * Creates a dependency provider for splashScreen (androidx.core:core-splashscreen)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSplashScreen() {
            return create("splashScreen");
    }

        /**
         * Creates a dependency provider for startup (androidx.startup:startup-runtime)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStartup() {
            return create("startup");
    }

        /**
         * Creates a dependency provider for svg (com.caverock:androidsvg-aar)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSvg() {
            return create("svg");
    }

        /**
         * Creates a dependency provider for testCore (androidx.arch.core:core-testing)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestCore() {
            return create("testCore");
    }

        /**
         * Creates a dependency provider for testCoreArch (androidx.arch.core:core-testing)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestCoreArch() {
            return create("testCoreArch");
    }

        /**
         * Creates a dependency provider for testCoroutines (org.jetbrains.kotlinx:kotlinx-coroutines-test)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestCoroutines() {
            return create("testCoroutines");
    }

        /**
         * Creates a dependency provider for testEspresso (androidx.test.espresso:espresso-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestEspresso() {
            return create("testEspresso");
    }

        /**
         * Creates a dependency provider for testExtJunit (androidx.test.ext:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestExtJunit() {
            return create("testExtJunit");
    }

        /**
         * Creates a dependency provider for testRobolectric (androidx.test:core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestRobolectric() {
            return create("testRobolectric");
    }

        /**
         * Creates a dependency provider for testRules (androidx.test:rules)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestRules() {
            return create("testRules");
    }

        /**
         * Creates a dependency provider for testRunner (androidx.test:runner)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestRunner() {
            return create("testRunner");
    }

        /**
         * Creates a dependency provider for timber (com.jakewharton.timber:timber)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTimber() {
            return create("timber");
    }

        /**
         * Creates a dependency provider for toolargetool (com.gu.android:toolargetool)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getToolargetool() {
            return create("toolargetool");
    }

        /**
         * Creates a dependency provider for webSocket (org.java-websocket:Java-WebSocket)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWebSocket() {
            return create("webSocket");
    }

        /**
         * Creates a dependency provider for xlog (com.elvishew:xlog)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getXlog() {
            return create("xlog");
    }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() {
        return laccForAccompanistLibraryAccessors;
    }

    /**
     * Returns the group of libraries at activity
     */
    public ActivityLibraryAccessors getActivity() {
        return laccForActivityLibraryAccessors;
    }

    /**
     * Returns the group of libraries at apollo
     */
    public ApolloLibraryAccessors getApollo() {
        return laccForApolloLibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() {
        return laccForFirebaseLibraryAccessors;
    }

    /**
     * Returns the group of libraries at hilt
     */
    public HiltLibraryAccessors getHilt() {
        return laccForHiltLibraryAccessors;
    }

    /**
     * Returns the group of libraries at lifecycle
     */
    public LifecycleLibraryAccessors getLifecycle() {
        return laccForLifecycleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at navigation
     */
    public NavigationLibraryAccessors getNavigation() {
        return laccForNavigationLibraryAccessors;
    }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Returns the group of libraries at sentry
     */
    public SentryLibraryAccessors getSentry() {
        return laccForSentryLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for flowlayout (com.google.accompanist:accompanist-flowlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFlowlayout() {
                return create("accompanist.flowlayout");
        }

            /**
             * Creates a dependency provider for insets (com.google.accompanist:accompanist-insets)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInsets() {
                return create("accompanist.insets");
        }

            /**
             * Creates a dependency provider for systemuicontroller (com.google.accompanist:accompanist-systemuicontroller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSystemuicontroller() {
                return create("accompanist.systemuicontroller");
        }

    }

    public static class ActivityLibraryAccessors extends SubDependencyFactory {

        public ActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("activity.appcompat");
        }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("activity.compose");
        }

            /**
             * Creates a dependency provider for ktx (androidx.activity:activity-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("activity.ktx");
        }

    }

    public static class ApolloLibraryAccessors extends SubDependencyFactory {

        public ApolloLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coroutines (com.apollographql.apollo:apollo-coroutines-support)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoroutines() {
                return create("apollo.coroutines");
        }

            /**
             * Creates a dependency provider for runtime (com.apollographql.apollo:apollo-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("apollo.runtime");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for adaptive (androidx.compose.material3:material3-window-size-class)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAdaptive() {
                return create("compose.adaptive");
        }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("compose.bom");
        }

            /**
             * Creates a dependency provider for debug (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDebug() {
                return create("compose.debug");
        }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() {
                return create("compose.material");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("compose.material3");
        }

            /**
             * Creates a dependency provider for navigation (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() {
                return create("compose.navigation");
        }

            /**
             * Creates a dependency provider for paging (androidx.paging:paging-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() {
                return create("compose.paging");
        }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiToolingLibraryAccessors laccForComposeUiToolingLibraryAccessors = new ComposeUiToolingLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.ui");
        }

        /**
         * Returns the group of libraries at compose.ui.tooling
         */
        public ComposeUiToolingLibraryAccessors getTooling() {
            return laccForComposeUiToolingLibraryAccessors;
        }

    }

    public static class ComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.ui.tooling");
        }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() {
                return create("compose.ui.tooling.preview");
        }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {
        private final FirebaseAnalyticsLibraryAccessors laccForFirebaseAnalyticsLibraryAccessors = new FirebaseAnalyticsLibraryAccessors(owner);
        private final FirebaseConfigLibraryAccessors laccForFirebaseConfigLibraryAccessors = new FirebaseConfigLibraryAccessors(owner);
        private final FirebaseCrashlyticsLibraryAccessors laccForFirebaseCrashlyticsLibraryAccessors = new FirebaseCrashlyticsLibraryAccessors(owner);

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("firebase.bom");
        }

        /**
         * Returns the group of libraries at firebase.analytics
         */
        public FirebaseAnalyticsLibraryAccessors getAnalytics() {
            return laccForFirebaseAnalyticsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at firebase.config
         */
        public FirebaseConfigLibraryAccessors getConfig() {
            return laccForFirebaseConfigLibraryAccessors;
        }

        /**
         * Returns the group of libraries at firebase.crashlytics
         */
        public FirebaseCrashlyticsLibraryAccessors getCrashlytics() {
            return laccForFirebaseCrashlyticsLibraryAccessors;
        }

    }

    public static class FirebaseAnalyticsLibraryAccessors extends SubDependencyFactory {

        public FirebaseAnalyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-analytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.analytics.ktx");
        }

    }

    public static class FirebaseConfigLibraryAccessors extends SubDependencyFactory {

        public FirebaseConfigLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-config-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.config.ktx");
        }

    }

    public static class FirebaseCrashlyticsLibraryAccessors extends SubDependencyFactory {

        public FirebaseCrashlyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-crashlytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.crashlytics.ktx");
        }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory {
        private final HiltNavigationLibraryAccessors laccForHiltNavigationLibraryAccessors = new HiltNavigationLibraryAccessors(owner);

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at hilt.navigation
         */
        public HiltNavigationLibraryAccessors getNavigation() {
            return laccForHiltNavigationLibraryAccessors;
        }

    }

    public static class HiltNavigationLibraryAccessors extends SubDependencyFactory {

        public HiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("hilt.navigation.compose");
        }

    }

    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleCommonLibraryAccessors laccForLifecycleCommonLibraryAccessors = new LifecycleCommonLibraryAccessors(owner);
        private final LifecycleLivedataLibraryAccessors laccForLifecycleLivedataLibraryAccessors = new LifecycleLivedataLibraryAccessors(owner);
        private final LifecycleRuntimeLibraryAccessors laccForLifecycleRuntimeLibraryAccessors = new LifecycleRuntimeLibraryAccessors(owner);
        private final LifecycleViewmodelLibraryAccessors laccForLifecycleViewmodelLibraryAccessors = new LifecycleViewmodelLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for service (androidx.lifecycle:lifecycle-service)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getService() {
                return create("lifecycle.service");
        }

        /**
         * Returns the group of libraries at lifecycle.common
         */
        public LifecycleCommonLibraryAccessors getCommon() {
            return laccForLifecycleCommonLibraryAccessors;
        }

        /**
         * Returns the group of libraries at lifecycle.livedata
         */
        public LifecycleLivedataLibraryAccessors getLivedata() {
            return laccForLifecycleLivedataLibraryAccessors;
        }

        /**
         * Returns the group of libraries at lifecycle.runtime
         */
        public LifecycleRuntimeLibraryAccessors getRuntime() {
            return laccForLifecycleRuntimeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at lifecycle.viewmodel
         */
        public LifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class LifecycleCommonLibraryAccessors extends SubDependencyFactory {

        public LifecycleCommonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for java8 (androidx.lifecycle:lifecycle-common-java8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava8() {
                return create("lifecycle.common.java8");
        }

    }

    public static class LifecycleLivedataLibraryAccessors extends SubDependencyFactory {

        public LifecycleLivedataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("lifecycle.livedata.ktx");
        }

    }

    public static class LifecycleRuntimeLibraryAccessors extends SubDependencyFactory {

        public LifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("lifecycle.runtime.ktx");
        }

    }

    public static class LifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public LifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("lifecycle.viewmodel.ktx");
        }

    }

    public static class NavigationLibraryAccessors extends SubDependencyFactory {

        public NavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for fragment (androidx.navigation:navigation-fragment-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFragment() {
                return create("navigation.fragment");
        }

            /**
             * Creates a dependency provider for ui (androidx.navigation:navigation-ui-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("navigation.ui");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("room.ktx");
        }

            /**
             * Creates a dependency provider for paging (androidx.room:room-paging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() {
                return create("room.paging");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("room.runtime");
        }

    }

    public static class SentryLibraryAccessors extends SubDependencyFactory {

        public SentryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for apollo (io.sentry:sentry-apollo)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApollo() {
                return create("sentry.apollo");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final CoreVersionAccessors vaccForCoreVersionAccessors = new CoreVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.30.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: activity (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("activity"); }

            /**
             * Returns the version associated to this alias: apollo (2.5.14)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApollo() { return getVersion("apollo"); }

            /**
             * Returns the version associated to this alias: appcompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: compose (1.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: composeBom (2023.05.01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeBom() { return getVersion("composeBom"); }

            /**
             * Returns the version associated to this alias: dagger (2.46.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDagger() { return getVersion("dagger"); }

            /**
             * Returns the version associated to this alias: firebaseBom (32.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseBom() { return getVersion("firebaseBom"); }

            /**
             * Returns the version associated to this alias: googleServices (4.3.15)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleServices() { return getVersion("googleServices"); }

            /**
             * Returns the version associated to this alias: gradlePlugin (8.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradlePlugin() { return getVersion("gradlePlugin"); }

            /**
             * Returns the version associated to this alias: hilt (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: kotlin (1.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinCoroutines (1.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinCoroutines() { return getVersion("kotlinCoroutines"); }

            /**
             * Returns the version associated to this alias: ksp (1.8.10-1.0.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKsp() { return getVersion("ksp"); }

            /**
             * Returns the version associated to this alias: lifecycle (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("lifecycle"); }

            /**
             * Returns the version associated to this alias: material (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: navigation (2.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("navigation"); }

            /**
             * Returns the version associated to this alias: room (2.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: sentry (6.23.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSentry() { return getVersion("sentry"); }

            /**
             * Returns the version associated to this alias: sentryPlugin (3.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSentryPlugin() { return getVersion("sentryPlugin"); }

            /**
             * Returns the version associated to this alias: splashScreen (1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSplashScreen() { return getVersion("splashScreen"); }

        /**
         * Returns the group of versions at versions.core
         */
        public CoreVersionAccessors getCore() {
            return vaccForCoreVersionAccessors;
        }

    }

    public static class CoreVersionAccessors extends VersionFactory  {

        public CoreVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: core.ktx (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtx() { return getVersion("core.ktx"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for activity which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.activity:activity-ktx</li>
             *    <li>androidx.activity:activity-compose</li>
             *    <li>androidx.appcompat:appcompat</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getActivity() {
                return createBundle("activity");
            }

            /**
             * Creates a dependency bundle provider for apollo which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.apollographql.apollo:apollo-runtime</li>
             *    <li>com.apollographql.apollo:apollo-coroutines-support</li>
             *    <li>com.squareup.okhttp3:logging-interceptor</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getApollo() {
                return createBundle("apollo");
            }

            /**
             * Creates a dependency bundle provider for compose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.ui:ui</li>
             *    <li>androidx.compose.ui:ui-test-manifest</li>
             *    <li>androidx.compose.material:material</li>
             *    <li>androidx.navigation:navigation-compose</li>
             *    <li>androidx.paging:paging-compose</li>
             *    <li>androidx.compose.ui:ui-tooling</li>
             *    <li>androidx.compose.ui:ui-tooling-preview</li>
             *    <li>androidx.compose.material3:material3-window-size-class</li>
             *    <li>androidx.compose.material3:material3</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCompose() {
                return createBundle("compose");
            }

            /**
             * Creates a dependency bundle provider for lifecycle which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.lifecycle:lifecycle-runtime-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-livedata-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-service</li>
             *    <li>androidx.lifecycle:lifecycle-common-java8</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLifecycle() {
                return createBundle("lifecycle");
            }

            /**
             * Creates a dependency bundle provider for measure which is an aggregate for the following dependencies:
             * <ul>
             *    <li>tech.units:indriya</li>
             *    <li>si.uom:si-units</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getMeasure() {
                return createBundle("measure");
            }

            /**
             * Creates a dependency bundle provider for navigation which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.navigation:navigation-fragment-ktx</li>
             *    <li>androidx.navigation:navigation-ui-ktx</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getNavigation() {
                return createBundle("navigation");
            }

            /**
             * Creates a dependency bundle provider for playCore which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.android.play:core</li>
             *    <li>com.google.android.play:core-ktx</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getPlayCore() {
                return createBundle("playCore");
            }

            /**
             * Creates a dependency bundle provider for room which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.room:room-runtime</li>
             *    <li>androidx.room:room-ktx</li>
             *    <li>androidx.room:room-paging</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRoom() {
                return createBundle("room");
            }

            /**
             * Creates a dependency bundle provider for sentry which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.sentry:sentry-apollo</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getSentry() {
                return createBundle("sentry");
            }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for androidApp to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApp() { return createPlugin("androidApp"); }

            /**
             * Creates a plugin provider for androidLibrary to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidLibrary() { return createPlugin("androidLibrary"); }

            /**
             * Creates a plugin provider for apollo to the plugin id 'com.apollographql.apollo'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApollo() { return createPlugin("apollo"); }

            /**
             * Creates a plugin provider for benManes to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getBenManes() { return createPlugin("benManes"); }

            /**
             * Creates a plugin provider for detekt to the plugin id 'io.gitlab.arturbosch.detekt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDetekt() { return createPlugin("detekt"); }

            /**
             * Creates a plugin provider for firebaseCrashlytics to the plugin id 'com.google.firebase.crashlytics'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getFirebaseCrashlytics() { return createPlugin("firebaseCrashlytics"); }

            /**
             * Creates a plugin provider for googleServices to the plugin id 'com.google.gms.google-services'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getGoogleServices() { return createPlugin("googleServices"); }

            /**
             * Creates a plugin provider for hilt to the plugin id 'dagger.hilt.android.plugin'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getHilt() { return createPlugin("hilt"); }

            /**
             * Creates a plugin provider for jvm to the plugin id 'org.jetbrains.kotlin.jvm'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJvm() { return createPlugin("jvm"); }

            /**
             * Creates a plugin provider for kotlin to the plugin id 'kotlin'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlin() { return createPlugin("kotlin"); }

            /**
             * Creates a plugin provider for kotlinAndroid to the plugin id 'kotlin-android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

            /**
             * Creates a plugin provider for kotlinKapt to the plugin id 'kotlin-kapt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinKapt() { return createPlugin("kotlinKapt"); }

            /**
             * Creates a plugin provider for kotlinParcelize to the plugin id 'kotlin-parcelize'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinParcelize() { return createPlugin("kotlinParcelize"); }

            /**
             * Creates a plugin provider for ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("ksp"); }

            /**
             * Creates a plugin provider for sentry to the plugin id 'io.sentry.android.gradle'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSentry() { return createPlugin("sentry"); }

            /**
             * Creates a plugin provider for serialization to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSerialization() { return createPlugin("serialization"); }

    }

}
