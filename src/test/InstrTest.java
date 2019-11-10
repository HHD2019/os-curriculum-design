package test;

import instruction.service.InstrService;
import org.junit.Test;

public class InstrTest {
    @Test
    public void Test() {
        InstrService instr = InstrService.getInstrService();
        System.out.println(instr.createAsnInstr(3, 55));
        System.out.println(instr.createEqpInstr(2, 6));
        System.out.println(instr.createForInstr(2, 68));
        System.out.println(instr.createMCMInstr(0, 0, 2, 2, 0));
        System.out.println(instr.createMCRInstr(0, 0, 1, 34, 1));
        System.out.println(instr.createRCRInstr(0, 32, 1, 23, 0));
        System.out.println(instr.createEndInstr());
    }
}