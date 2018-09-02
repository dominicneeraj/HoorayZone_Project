# -*- coding: utf-8 -*-
# Generated by Django 1.11.2 on 2018-07-01 01:39
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('cart', '0004_event_address'),
    ]

    operations = [
        migrations.CreateModel(
            name='Price',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=1000)),
                ('description', models.CharField(blank=True, max_length=1000)),
                ('price', models.CharField(blank=True, max_length=1000)),
            ],
        ),
        migrations.RemoveField(
            model_name='event',
            name='price',
        ),
        migrations.AddField(
            model_name='price',
            name='event',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='cart.Event'),
        ),
    ]
