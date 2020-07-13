package nl.saproto.protomc.helpers;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Morphia;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database _instance;
    private MongoClient mc;
    private Morphia morphia;

    private Database() {
        ServerAddress addr = new ServerAddress(ServerAddress.defaultHost(), ServerAddress.defaultPort());
        List<MongoCredential> credentials = new ArrayList<>();
        credentials.add(MongoCredential.createCredential("username", "database", "password".toCharArray()));
        mc = new MongoClient(addr, credentials);
        morphia = new Morphia();
    }

    public static Database getInstance() {
        if (_instance == null)
            _instance = new Database();
        return _instance;
    }
}
