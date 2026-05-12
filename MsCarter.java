<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="16" max="-2" attributes="0"/>
                      <Component id="jTabbedPane1" min="-2" pref="306" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="139" max="-2" attributes="0"/>
                      <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="121" max="-2" attributes="0"/>
                      <Component id="jButton1" min="-2" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace pref="21" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="17" max="-2" attributes="0"/>
              <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="47" max="-2" attributes="0"/>
              <Component id="jTabbedPane1" min="-2" pref="173" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="jButton1" min="-2" max="-2" attributes="0"/>
              <EmptySpace pref="12" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JTabbedPane" name="jTabbedPane1">
      <Events>
        <EventHandler event="stateChanged" listener="javax.swing.event.ChangeListener" parameters="javax.swing.event.ChangeEvent" handler="jTabbedPane1StateChanged"/>
      </Events>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout"/>
      <SubComponents>
        <Container class="javax.swing.JScrollPane" name="jScrollPane1">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Class 1">
                <Property name="tabTitle" type="java.lang.String" value="Class 1"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JList" name="jList1">
              <Properties>
                <Property name="model" type="javax.swing.ListModel" editor="org.netbeans.modules.form.editors2.ListModelEditor">
                  <StringArray count="5">
                    <StringItem index="0" value="Item 1"/>
                    <StringItem index="1" value="Item 2"/>
                    <StringItem index="2" value="Item 3"/>
                    <StringItem index="3" value="Item 4"/>
                    <StringItem index="4" value="Item 5"/>
                  </StringArray>
                </Property>
              </Properties>
              <AuxValues>
                <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
              </AuxValues>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JScrollPane" name="jScrollPane2">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Class 2">
                <Property name="tabTitle" type="java.lang.String" value="Class 2"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JList" name="jList2">
              <Properties>
                <Property name="model" type="javax.swing.ListModel" editor="org.netbeans.modules.form.editors2.ListModelEditor">
                  <StringArray count="5">
                    <StringItem index="0" value="Item 1"/>
                    <StringItem index="1" value="Item 2"/>
                    <StringItem index="2" value="Item 3"/>
                    <StringItem index="3" value="Item 4"/>
                    <StringItem index="4" value="Item 5"/>
                  </StringArray>
                </Property>
              </Properties>
              <AuxValues>
                <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
              </AuxValues>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JScrollPane" name="jScrollPane3">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Class 3">
                <Property name="tabTitle" type="java.lang.String" value="Class 3"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JList" name="jList3">
              <Properties>
                <Property name="model" type="javax.swing.ListModel" editor="org.netbeans.modules.form.editors2.ListModelEditor">
                  <StringArray count="5">
                    <StringItem index="0" value="Item 1"/>
                    <StringItem index="1" value="Item 2"/>
                    <StringItem index="2" value="Item 3"/>
                    <StringItem index="3" value="Item 4"/>
                    <StringItem index="4" value="Item 5"/>
                  </StringArray>
                </Property>
              </Properties>
              <AuxValues>
                <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
              </AuxValues>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JScrollPane" name="jScrollPane4">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Class 4">
                <Property name="tabTitle" type="java.lang.String" value="Class 4"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JList" name="jList4">
              <Properties>
                <Property name="model" type="javax.swing.ListModel" editor="org.netbeans.modules.form.editors2.ListModelEditor">
                  <StringArray count="5">
                    <StringItem index="0" value="Item 1"/>
                    <StringItem index="1" value="Item 2"/>
                    <StringItem index="2" value="Item 3"/>
                    <StringItem index="3" value="Item 4"/>
                    <StringItem index="4" value="Item 5"/>
                  </StringArray>
                </Property>
              </Properties>
              <AuxValues>
                <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
              </AuxValues>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JScrollPane" name="jScrollPane5">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Class 5">
                <Property name="tabTitle" type="java.lang.String" value="Class 5"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JList" name="jList5">
              <Properties>
                <Property name="model" type="javax.swing.ListModel" editor="org.netbeans.modules.form.editors2.ListModelEditor">
                  <StringArray count="5">
                    <StringItem index="0" value="Item 1"/>
                    <StringItem index="1" value="Item 2"/>
                    <StringItem index="2" value="Item 3"/>
                    <StringItem index="3" value="Item 4"/>
                    <StringItem index="4" value="Item 5"/>
                  </StringArray>
                </Property>
              </Properties>
              <AuxValues>
                <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
              </AuxValues>
            </Component>
          </SubComponents>
        </Container>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Final Grades"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="jButton1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Close"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton1ActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
