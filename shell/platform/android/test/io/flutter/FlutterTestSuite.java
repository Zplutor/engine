// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter;

import io.flutter.embedding.android.FlutterActivityAndFragmentDelegateTest;
import io.flutter.embedding.android.FlutterActivityTest;
import io.flutter.embedding.android.FlutterAndroidComponentTest;
import io.flutter.embedding.android.FlutterFragmentActivityTest;
import io.flutter.embedding.android.FlutterFragmentTest;
import io.flutter.embedding.android.FlutterTextureViewTest;
import io.flutter.embedding.android.FlutterViewTest;
import io.flutter.embedding.android.KeyChannelResponderTest;
import io.flutter.embedding.android.KeyboardManagerTest;
import io.flutter.embedding.engine.FlutterEngineCacheTest;
import io.flutter.embedding.engine.FlutterEngineConnectionRegistryTest;
import io.flutter.embedding.engine.FlutterEngineGroupComponentTest;
import io.flutter.embedding.engine.FlutterJNITest;
import io.flutter.embedding.engine.RenderingComponentTest;
import io.flutter.embedding.engine.dart.DartExecutorTest;
import io.flutter.embedding.engine.dart.DartMessengerTest;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManagerTest;
import io.flutter.embedding.engine.loader.ApplicationInfoLoaderTest;
import io.flutter.embedding.engine.loader.FlutterLoaderTest;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorViewTest;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistryTest;
import io.flutter.embedding.engine.renderer.FlutterRendererTest;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannelTest;
import io.flutter.embedding.engine.systemchannels.KeyEventChannelTest;
import io.flutter.embedding.engine.systemchannels.PlatformChannelTest;
import io.flutter.embedding.engine.systemchannels.RestorationChannelTest;
import io.flutter.embedding.engine.systemchannels.TextInputChannelTest;
import io.flutter.external.FlutterLaunchTests;
import io.flutter.plugin.common.BinaryCodecTest;
import io.flutter.plugin.common.StandardMessageCodecTest;
import io.flutter.plugin.common.StandardMethodCodecTest;
import io.flutter.plugin.editing.InputConnectionAdaptorTest;
import io.flutter.plugin.editing.ListenableEditingStateTest;
import io.flutter.plugin.editing.TextInputPluginTest;
import io.flutter.plugin.localization.LocalizationPluginTest;
import io.flutter.plugin.mouse.MouseCursorPluginTest;
import io.flutter.plugin.platform.PlatformPluginTest;
import io.flutter.plugin.platform.PlatformViewsControllerTest;
import io.flutter.plugin.platform.SingleViewPresentationTest;
import io.flutter.util.PreconditionsTest;
import io.flutter.view.AccessibilityBridgeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.io.flutter.embedding.engine.FlutterEngineTest;
import test.io.flutter.embedding.engine.FlutterShellArgsTest;
import test.io.flutter.embedding.engine.PluginComponentTest;

@RunWith(Suite.class)
@SuiteClasses({
  AccessibilityBridgeTest.class,
  ApplicationInfoLoaderTest.class,
  BinaryCodecTest.class,
  DartExecutorTest.class,
  DartMessengerTest.class,
  FlutterActivityAndFragmentDelegateTest.class,
  FlutterActivityTest.class,
  FlutterAndroidComponentTest.class,
  FlutterEngineCacheTest.class,
  FlutterEngineConnectionRegistryTest.class,
  FlutterEngineGroupComponentTest.class,
  FlutterEngineTest.class,
  FlutterFragmentActivityTest.class,
  FlutterFragmentTest.class,
  FlutterInjectorTest.class,
  FlutterJNITest.class,
  FlutterLaunchTests.class,
  FlutterLoaderTest.class,
  FlutterMutatorViewTest.class,
  FlutterShellArgsTest.class,
  FlutterRendererTest.class,
  FlutterShellArgsTest.class,
  FlutterTextureViewTest.class,
  FlutterViewTest.class,
  InputConnectionAdaptorTest.class,
  DeferredComponentChannelTest.class,
  KeyboardManagerTest.class,
  KeyChannelResponderTest.class,
  KeyEventChannelTest.class,
  ListenableEditingStateTest.class,
  LocalizationPluginTest.class,
  MouseCursorPluginTest.class,
  PlatformChannelTest.class,
  PlatformPluginTest.class,
  PlatformViewsControllerTest.class,
  PlayStoreDeferredComponentManagerTest.class,
  PluginComponentTest.class,
  PreconditionsTest.class,
  RenderingComponentTest.class,
  RestorationChannelTest.class,
  ShimPluginRegistryTest.class,
  SingleViewPresentationTest.class,
  SmokeTest.class,
  StandardMessageCodecTest.class,
  StandardMethodCodecTest.class,
  TextInputChannelTest.class,
  TextInputPluginTest.class,
})
/** Runs all of the unit tests listed in the {@code @SuiteClasses} annotation. */
public class FlutterTestSuite {}
