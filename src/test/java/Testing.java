import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;


public class Testing {

    @Test
    public void test_fail() {
        fail("Let's test the failing unit test");
    }
}

 //   mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar -Dmaven.test.failure.ignore=true -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=friendspammer -Dsonar.login=3b2efdf08c061da5104a594afdf6565db69c2a05