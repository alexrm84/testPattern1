package alexrm84.testPattern.services;

import alexrm84.testPattern.entities.InfoMSG;
import alexrm84.testPattern.repositories.InfoMSGRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


@Service
@Transactional
public class InfoMSGService {
    private InfoMSGRepository repository;
    private Map<Integer, InfoMSG> infoMSGMap = new ConcurrentHashMap<>()

    @Autowired
    public void setRepository(InfoMSGRepository repository) {
        this.repository = repository;
    }

    public InfoMSG findById(Integer id) {
        InfoMSG infoMSG = infoMSGMap.get(id);
        if (infoMSG == null) {
            infoMSG = repository.findById(id).get();
            infoMSGMap.put(infoMSG.getId(),infoMSG);
        }
        return infoMSG;
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
        infoMSGMap.remove(id);
    }

    public List<InfoMSG> findAll(){
        List<InfoMSG> infoMSGList = repository.findAll();
        infoMSGMap.putAll(((Map) infoMSGList.stream().collect(Collectors.groupingBy(InfoMSG::getId))));
        return infoMSGList;
    }
}
