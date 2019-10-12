package io.xiaofeng.play;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardPlayApplication extends Application<DropwizardPlayConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardPlayApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard_play";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardPlayConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardPlayConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
