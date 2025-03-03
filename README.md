### Server
Wildfly 35

### Intellij idea
2024.2.4 Ultimate Edition

```
@Entity
public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
```

```
@Path("/todos")
public class HelloResource {

    @Inject private TodoRepository todoRepository;

    @GET
    public List<Todo> hello() {
        return todoRepository.findAll().toList();
    }
}
```

```
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
```
