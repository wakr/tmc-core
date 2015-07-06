package hy.tmc.core.configuration;

import com.google.common.base.Optional;
import hy.tmc.core.domain.Course;

public interface TmcSettings {

    public String getServerAddress();

    public String getPassword();

    public String getUsername();

    /**
     * Checks that username and password are not null. 
     */
    public boolean userDataExists();

    public Optional<Course> getCurrentCourse();

    public String apiVersion();

    public String getFormattedUserData();
    
}
