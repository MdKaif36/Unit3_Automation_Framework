package utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

@UtilityClass
public class FileUtils {

    public static boolean isFileDownloaded(File file) {
        try {
            Awaitility.await()
                    .atMost(30, TimeUnit.SECONDS)
                    .pollInterval(500, TimeUnit.MILLISECONDS)
                    .until(() -> file.exists() && file.length() > 0);
            return true;
        } catch (ConditionTimeoutException e) {
            return false;
        }
    }

    public void deleteFileIfExist(File file) {
        if (file.exists()) {
            file.delete();
        }
    }
}
