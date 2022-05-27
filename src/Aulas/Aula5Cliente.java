package Aulas;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.*;

public class Aula5Cliente {

    public static void disparaErro() throws Exception{
        throw new Exception("Erro Forçado");
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.remove("C");

        for (String palavra : lista) {
            System.out.println(palavra);
        }

        Set<String> set = new LinkedHashSet<String>();
        set.add("B");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("A");

        for (String palavra : set) {
            System.out.println(palavra);
        }

        Queue<String> queue = new PriorityQueue<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("A");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C");

        for (Integer chave : map.keySet()) {
            System.out.println(chave);
        }

        for (String valor : map.values()) {
            System.out.println(valor);
        }

        try {
            Aula5Cliente.disparaErro();
        } catch (ExceptionHasMessage e) {
            System.out.println("Erro de Mensagem Tratado");
        } catch (Exception e) {
            System.out.println("Erro Tratado");
        }  finally {
            System.out.println("Finally Executado");
        }
    }
}
