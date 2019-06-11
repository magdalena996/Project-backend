package pl.edu.wszib.Projectbackend.dbmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="applications")
public class Application
{
    @GeneratedValue
    @Id
    private long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String nick;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String position;
    @Column(nullable = false)
    private int knowledgeTS3;
    @Column(nullable = false)
    private int ranks;
    @Column(nullable = false)
    private int createChannels;
    @Column(nullable = false)
    private int groupWork;
    @Column(nullable = false)
    private String wordsAboutSelf;
    @Column(nullable = false)
    private String whyApply;
}
