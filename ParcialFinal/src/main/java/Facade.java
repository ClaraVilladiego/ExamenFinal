public class Facade implements IFacade{
    private final ScheduleServer server;

    public Facade (ScheduleServer server){
        this.server = server;

    }

    @Override
    public void starServer() {
        server.readSystemConfigFile();
        server.init();
        server.InitializeContext();
    }

    @Override
    public void stopServer() {
        server.destroy();
        server.shutdown();
    }
}
