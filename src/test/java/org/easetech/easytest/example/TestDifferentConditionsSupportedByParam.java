package org.easetech.easytest.example;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Deque;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import javax.management.AttributeList;
import javax.management.relation.RoleList;
import javax.management.relation.RoleUnresolvedList;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.converter.ConverterManager;
import org.easetech.easytest.example.EnumObject.Workingday;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.util.Assert;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths={"classpath:paramTestConditions.csv"})
public class TestDifferentConditionsSupportedByParam {
    
    @BeforeClass
    public static void before(){
        ConverterManager.registerConverter(ComparableObjectConverter.class);
        ConverterManager.registerConverter(EnumConverter.class);
        ConverterManager.registerConverter(DelayedObjectConverter.class);
    }
    
    @Test
    public void testNonGenericListInterface(@Param(name="items") List items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListInterface : "+item);
        }
    }
    
    @Test
    public void testGenericListInterface(@Param(name="items") List<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testGenericListInterface : "+item);
        }
    }
    
    @Test
    public void testGenericListImplementation(@Param(name="items") LinkedList<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testNonGenericListImplementation(@Param(name="items") LinkedList items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testGenericSetInterface(@Param(name="dates") Set<Date> items){
        Assert.notNull(items);
        for(Date date : items){
            System.out.println("testNonGenericListImplementation : "+date);
        }
    }
    
    @Test
    public void testNonGenericSetInterface(@Param(name="items") Set items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testNonGenericSetImplementation(@Param(name="items") TreeSet items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testGenericSetImplementation(@Param(name="items") SortedSet<Long> items){
        Assert.notNull(items);
        for(Long item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testGenericQueueInterface(@Param(name="items") Queue<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testNonGenericQueueInterface(@Param(name="items") Queue items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
//    @Test
//    public void testNonGenericQueueImplementation(@Param(name="items") BlockingDeque items){
//        Assert.notNull(items);
//        for(Object item : items){
//            System.out.println("testNonGenericListImplementation : "+item);
//        }
//    }
    
    @Test
    public void testNonGenericBlockingQueueImplementation(@Param(name="items") BlockingQueue items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
//    @Test
//    public void testNonGenericDequeImplementation(@Param(name="items") Deque items){
//        Assert.notNull(items);
//        for(Object item : items){
//            System.out.println("testNonGenericListImplementation : "+item);
//        }
//    }
    
    @Test
    public void testGenericQueueImplementation(@Param(name="items") Collection<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    //FROM HERE
    @Test
    public void testAbstractCollection(@Param(name="items") AbstractCollection<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testAbstractList(@Param(name="items") AbstractList<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testAbstractQueue(@Param(name="items") AbstractQueue<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }

    @Test
    public void testAbstractSequentialList(@Param(name="items") AbstractSequentialList<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testAbstractSet(@Param(name="items") AbstractSet<ComparableObject> items){
        Assert.notNull(items);
        for(ComparableObject item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testArrayBlockingQueue(@Param(name="items") ArrayBlockingQueue<Float> items){
        Assert.notNull(items);
        for(Float item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testArrayDeque(@Param(name="items") ArrayDeque<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testArrayList(@Param(name="items") ArrayList<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testAttributeList(@Param(name="items") AttributeList items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testConcurrentLinkedQueue(@Param(name="items") ConcurrentLinkedQueue<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testConcurrentSkipListSet(@Param(name="items") ConcurrentSkipListSet<ComparableObject> items){
        Assert.notNull(items);
        for(ComparableObject item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testCopyOnWriteArrayList(@Param(name="items") CopyOnWriteArrayList<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testCopyOnWriteArraySet(@Param(name="items") CopyOnWriteArraySet<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    @Test
    public void testEnumSet(@Param(name="items") EnumSet<Workingday> items){
        
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
//    @Test
//    public void testLinkedBlockingDeque(@Param(name="items") LinkedBlockingDeque<ItemId> items){
//        Assert.notNull(items);
//        for(ItemId item : items){
//            System.out.println("testNonGenericListImplementation : "+item);
//        }
//    }
    
    @Test
    public void testLinkedBlockingQueue(@Param(name="items") LinkedBlockingQueue<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testLinkedHashSet(@Param(name="items") LinkedHashSet<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testPriorityBlockingQueue(@Param(name="items") PriorityBlockingQueue<ComparableObject> items){
        Assert.notNull(items);
        for(ComparableObject item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testPriorityQueue(@Param(name="items") PriorityQueue<ComparableObject> items){
        Assert.notNull(items);
        for(ComparableObject item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testRoleList(@Param(name="items") RoleList items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testRoleUnresolvedList(@Param(name="items") RoleUnresolvedList items){
        Assert.notNull(items);
        for(Object item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
    
    @Test
    public void testStack(@Param(name="items") Stack<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }

    
    @Test
    public void testVector(@Param(name="items") Vector<ItemId> items){
        Assert.notNull(items);
        for(ItemId item : items){
            System.out.println("testNonGenericListImplementation : "+item);
        }
    }
}
