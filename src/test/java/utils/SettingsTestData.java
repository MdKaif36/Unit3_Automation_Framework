package utils;

import lombok.Getter;
import utils.EnvData;

@Getter
public class SettingsTestData {

    public static EnvData getEnvData() {
        return new EnvData();
    }

    public static UserData getUserData() {
        return new UserData();
    }
}
