package io.xiaofeng.play;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.xiaofeng.play.health.PlayHealthCheck;
import io.xiaofeng.play.resources.HelloResource;

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
        final HelloResource resource = new HelloResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        final PlayHealthCheck healthCheck = new PlayHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("Play health", healthCheck);
        environment.jersey().register(resource);
    }

}
