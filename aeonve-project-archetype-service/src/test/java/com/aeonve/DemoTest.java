package com.aeonve;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * demo test.
 *
 * @author aeonve
 * @date 2020年05月20日 23:36
 * @since 1.0.0
 */
public class DemoTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(DemoTest.class);

  @Test
  public void log() {
    LOGGER.info("this is a log test.");
  }

  @Test
  public void demo() {
    File customBundleFile = new File(
        System.getProperty("user.dir") + "/../settings/properties/project-info-custom-zh_CN.properties");
    if (customBundleFile.isFile() && customBundleFile.getName().endsWith(".properties")) {
      String bundleName =
          customBundleFile.getName().substring(0, customBundleFile.getName().indexOf(".properties"));
      URLClassLoader classLoader = null;
      try {
        classLoader = new URLClassLoader(new URL[]{customBundleFile.getParentFile().toURI().toURL()});
      } catch (MalformedURLException e) {
        // could not happen.
      }

      ResourceBundle bundle = ResourceBundle.getBundle(bundleName, Locale.getDefault(), classLoader);
    }
  }

}
