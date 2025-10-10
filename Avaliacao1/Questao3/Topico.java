import java.util.ArrayList;
import java.util.List;

// Esse é o subject, possui os métodos de attach e dettach para adicionar ou remover novos observers. Possui um método para notificar todos os observers, esse método é chamado ao criar uma nova noticia.
public class Topico {
    private List<Observer> observers = new ArrayList<>();
    private List<String> noticias = new ArrayList<>();

    public Topico(){};

    public String buscarUltimaNoticia(){
        return noticias.getLast();
    }

    public void adicionarNoticia(String noticia){
        noticias.add(noticia);
        notifyAllObservers();
    }

    public void attach(Observer o){
        observers.add(o);
    }

    public void dettach(Observer o){
        observers.remove(o);
    }

    public void notifyAllObservers(){
        for (Observer o : observers){
            o.update();
        }
    }
} 
