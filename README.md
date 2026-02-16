<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GameApp – Strategy Pattern</title>
</head>
<body>

<h1>🎮 GameApp – Strategy Pattern Implementation</h1>

<h2>📌 Problem Scenario</h2>
<p>
In this GameApp, we have three types of characters:
</p>

<ul>
    <li><strong>Knight</strong>
        <ul>
            <li>Attacks using a sword</li>
            <li>Can defend using:
                <ul>
                    <li>Shield</li>
                    <li>Dodge</li>
                    <li>Magic Barrier</li>
                </ul>
            </li>
        </ul>
    </li>

    <li><strong>Wizard</strong>
        <ul>
            <li>Attacks by casting spells</li>
            <li>Defends using Magic Barrier</li>
        </ul>
    </li>

    <li><strong>Archer</strong>
        <ul>
            <li>Attacks by shooting arrows</li>
            <li>Defends using Dodge</li>
        </ul>
    </li>
</ul>

<p>
Instead of using conditional statements (<code>if-else</code>), the system is refactored using the <strong>Strategy Design Pattern</strong>.
</p>

<hr>

<h2>🎯 Objective</h2>

<h3>A. DefenseStrategy</h3>
<ol>
    <li>Shield</li>
    <li>Dodge</li>
    <li>CreateMagic</li>
</ol>

<h3>B. AttackStrategy</h3>
<ol>
    <li>CastSpell</li>
    <li>ShootArrow</li>
    <li>SwingSword</li>
</ol>

<p>
Each character contains:
</p>
<ul>
    <li>An AttackStrategy</li>
    <li>A DefenseStrategy</li>
    <li>The ability to change strategies at runtime</li>
</ul>

<hr>

<h2>🧠 Design Pattern Used</h2>

<h3>Strategy Pattern</h3>
<p>
The Strategy Pattern allows behavior (attack and defense) to be selected dynamically at runtime.
</p>

<h4>Why use Strategy Pattern?</h4>
<ul>
    <li>Removes conditional statements</li>
    <li>Follows Open/Closed Principle</li>
    <li>Encapsulates behavior</li>
    <li>Improves scalability</li>
    <li>Promotes clean object-oriented design</li>
</ul>

<hr>

<h2>🏗 System Structure</h2>

<h3>Interfaces</h3>
<ul>
    <li>AttackStrategy</li>
    <li>DefenseStrategy</li>
</ul>

<h3>Concrete Attack Strategies</h3>
<ul>
    <li>SwingSword</li>
    <li>CastSpell</li>
    <li>ShootArrow</li>
</ul>

<h3>Concrete Defense Strategies</h3>
<ul>
    <li>Shield</li>
    <li>Dodge</li>
    <li>CreateMagic</li>
</ul>

<h3>Character Hierarchy</h3>
<ul>
    <li>GameCharacter (Abstract Class)
        <ul>
            <li>Knight</li>
            <li>Wizard</li>
            <li>Archer</li>
        </ul>
    </li>
</ul>

<hr>

<h2>🔄 Behavior Assignment</h2>

<table border="1" cellpadding="8">
    <tr>
        <th>Character</th>
        <th>Attack Strategy</th>
        <th>Defense Strategy</th>
    </tr>
    <tr>
        <td>Knight</td>
        <td>SwingSword</td>
        <td>Shield (default, can change)</td>
    </tr>
    <tr>
        <td>Wizard</td>
        <td>CastSpell</td>
        <td>CreateMagic</td>
    </tr>
    <tr>
        <td>Archer</td>
        <td>ShootArrow</td>
        <td>Dodge</td>
    </tr>
</table>

<hr>

<h2>🚀 Example Usage</h2>

<pre>
GameCharacter knight = new Knight();
knight.performAttack();     // Swinging a sword!
knight.performDefense();    // Using a shield!

knight.setDefenseStrategy(new Dodge());
knight.performDefense();    // Dodging to avoid attack!
</pre>

<hr>

<h2>📂 Project Structure</h2>

<pre>
├── AttackStrategy.java
├── DefenseStrategy.java
├── SwingSword.java
├── CastSpell.java
├── ShootArrow.java
├── Shield.java
├── Dodge.java
├── CreateMagic.java
├── GameCharacter.java
├── Knight.java
├── Wizard.java
├── Archer.java
└── GameApp.java
</pre>

<hr>

<h2>👨‍💻 Author</h2>
<p>
Developed as part of a Design Patterns implementation exercise.
</p>

</body>
</html>
