package pl.itbrains.demo.quarkus.intro;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeIntroResourceIT extends IntroResourceTest {

    // Execute the same tests but in native mode.
}