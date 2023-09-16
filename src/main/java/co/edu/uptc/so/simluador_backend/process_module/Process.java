package co.edu.uptc.so.simluador_backend.process_module;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Clase Process
@Getter
@Setter
@Component
@NoArgsConstructor
public class Process {
    private int id;
    private int lifeTime;
    private int IOTime;
    private int nextIOTime;
    private int timeToLive;
    private int nextIOTTL;
    private int IOTimeToLive;
    private ProcessStatus status;
    private int quantum;

    public Process(int id, int lifeTime, int IOTime, int quantum) {
        this.id = id;
        this.lifeTime = lifeTime;
        this.IOTime = IOTime;
        this.nextIOTime = IOTime;
        this.timeToLive = lifeTime;
        this.nextIOTTL = IOTime;
        this.IOTimeToLive = IOTime;
        this.status = ProcessStatus.READY;
        this.quantum = quantum;
    }

    public Process(Process process) {
        this.id = process.id;
        this.lifeTime = process.lifeTime;
        this.IOTime = process.IOTime;
        this.nextIOTime = process.IOTime;
        this.timeToLive = process.lifeTime;
        this.nextIOTTL = process.IOTime;
        this.IOTimeToLive = process.IOTime;
        this.status = process.status;
        this.quantum = process.quantum;
    }

    public void substractTTL() {
        timeToLive--;
    }

    public void substracQuantum() {
        quantum--;
    }

    public void substractNextIOTTL() {
        nextIOTTL--;
    }
}